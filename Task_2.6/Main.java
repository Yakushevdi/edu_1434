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
