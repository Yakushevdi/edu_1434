/*
* Задание: Дана коллекция с числами. Запишите в новую коллекцию только те числа, которые больше нуля и меньше 10-ти.
* Коллекции вы создаёте сами
*/

import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayList<Integer> nums = new ArrayList();
        ArrayList<Integer> naturNums = new ArrayList();

        System.out.print("Введите число: ");
        nums.add(scan.nextInt());

        while (true) {
            Scanner scanner = new Scanner(System.in);

            try {
                System.out.print("Введите еще числа(если не хотите введите любой не циферный символ) ");
                nums.add(scanner.nextInt());
                System.out.println(nums);

            } catch (InputMismatchException e) {
                break;
            }
        }

        for (int i = 0; i < nums.size(); i++) {
            Integer naturNum;

            naturNum = nums.get(i);

            if (0 < naturNum && naturNum < 10) naturNums.add(naturNum);
        }

        System.out.println("Коллекция с любыми числами: "+nums);
        System.out.println("Коллекция с отобранными числами которые больше нуля и меньше 10-ти: "+naturNums);
    }
}
