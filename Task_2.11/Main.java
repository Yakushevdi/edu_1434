/*
Задание: Дан массив с числами. Узнайте сколько элементов с начала массива надо сложить, чтобы в сумме получилось больше 10-ти.
*/

public class Main {
    public static void main(String[] args) {

        int numbers [] ={2,3,4,5,12,12,323};
        int summ = 0;
        int i=0;

        while (summ <= 10) {
            summ = summ + numbers[i];
            i++;
        }
        System.out.println("Сколько элементов сложилось: "+i);
    }
}
