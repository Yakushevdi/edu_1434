import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main<numsList> {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Введите путь к файлу: ");
        File file = new File(scan.nextLine());
        ArrayList <String> numsList = new ArrayList();
        ArrayList <Integer> evenNums = new ArrayList();

        try {
            FileReader reader = new FileReader(file);
            int c;
            String nums = "";

            while ((c=reader.read()) != -1) {

                if (c == 13) continue;

                else if (c == 10) {
                    numsList.add(nums);
                    nums = "";
                } else nums = nums + (char) c;
            } numsList.add(nums);

            } catch(IOException e) {
                e.printStackTrace();
        }
            for (int i = 0; i < numsList.size(); i++) {
            int a = Integer.parseInt(numsList.get (i));
            if (a%2==0) evenNums.add(a);

        } Collections.sort(evenNums);
        System.out.println(numsList);
        System.out.println(evenNums);
    }
}
