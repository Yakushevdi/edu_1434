/*
* Дана коллекция имён.
* 1) удалить все повторяющиеся имена из коллекции
* 2) вывести коллекцию на экран
* */

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList();
        String check = "abc";

        names.add("Анатолий");
        names.add("Георгий");
        names.add("Руслан");
        names.add("Георгий");
        names.add("Павел");
        names.add("Руслан");

        for (int i = 0; i < names.size(); i++){
            int index = 0;
            check=names.get(i);
           
            for (int j = 0; j < names.size(); j++) {

                if (names.get(j).equals(check)) index++;

                if (index>1) names.remove(j);
            }
        }

        System.out.println(names);
    }
}
