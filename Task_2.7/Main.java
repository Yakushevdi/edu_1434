public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число A: ");
        int a = scanner.nextInt();
        boolean count = false;

        for (int i = 2; i < a; i++) {
            if (a%i==0) count=true;
        }
        
        if (false) System.out.println(count);
        else System.out.println(count);

    }
}
