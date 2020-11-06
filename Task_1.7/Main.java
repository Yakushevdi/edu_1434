import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int length = scan.nextInt();
        int width = scan.nextInt();
        int height = scan.nextInt();
        int Vm3 = length*width*height;
        int Vltr = Vm3*1000;

        System.out.println("Ответ: "+Vltr+" литров");
    }
}
