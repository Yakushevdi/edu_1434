/*
Задание: Пользователь вводит сумму вклада и процент, который будет начисляться ежегодно. Отобразить размер вклада поочередно на ближайшие 5 лет.
*/


public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Сумма вклада: ");
        float summ = scanner.nextInt();
        System.out.print("Годовой процент по вкладу на 5 лет: ");
        float percent = scanner.nextInt();

        for (int i = 1; i < 6; i++) {
            summ=summ*(percent/100+1);
            System.out.println("Сумма вклада "+i+" год: "+ Math.round(summ));
        }
    }
}
