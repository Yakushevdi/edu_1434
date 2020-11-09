public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int a = scanner.nextInt();

        if (a==10) System.out.println("Верно");
        else System.out.println("Неверно");
    }
}
