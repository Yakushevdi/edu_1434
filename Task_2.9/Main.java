public class Main {
    public static void main(String[] args) {

        int numbers [] = {2,3,4,5,6,7,10,22,12,11,13,15,19};
        boolean a = false;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 19) a=true;
            }
        
        if (a==true) {
            System.out.println("ДА");
        }
        else System.out.println("НЕТ");

    }
}
