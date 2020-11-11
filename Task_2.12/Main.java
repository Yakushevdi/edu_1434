/*
ВНИМАНИЕ эта задача для ДЗ и не является обязательной.
Задание: 1. Создай массив чисел.
2. Добавь в массив 10 чисел с клавиатуры.
3. Вывести на экран длину самой длинной последовательности повторяющихся чисел в списке.
Пример для списка 2, 4, 4, 4, 8, 8, 4, 12, 12, 14:
3
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] arg){

        Scanner scanner = new Scanner(System.in);

        int numbers [] = new int[10];
        int counter = 1;
        int max = 1;

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Input number "+(i+1)+" : ");
            numbers[i] = scanner.nextInt();
        }

        for (int j = 0; j < numbers.length-1; j++) {
            if (numbers[j]==numbers[j+1]){
                counter++;
                if (max<counter) max = counter;
            }
            else counter =1;
        }
        System.out.println(max);
    }
}
