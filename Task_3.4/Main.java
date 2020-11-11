import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введиет первое число: ");
        int num1 = scanner.nextInt();
        System.out.print ("Введиет второе число: ");
        int num2 = scanner.nextInt();
        System.out.println(comparison(num1, num2));

    }

    public static boolean comparison(int a, int b) {
        if ((a + b) >10) return true;
        else return false;

    }

}
