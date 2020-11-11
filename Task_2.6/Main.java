/*
Задание: Даны переменные a и b. Проверьте, что a делится без остатка на b. Если это так - выведите 'Делится' и результат деления, иначе выведите 'Делится с остатком' и остаток от деления.
*/

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число A: ");
        int a = scanner.nextInt();
        System.out.print("Введите число B: ");
        int b = scanner.nextInt();

        if ((a % b) == 0)  System.out.println("Делится");
        else System.out.println("Делится c остатком: " + a%b);
    }
}
