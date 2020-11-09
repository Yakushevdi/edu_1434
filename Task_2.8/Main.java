public class Main {
    public static void main(String[] args) {

        int numbers [] ={2,3,4,5};
        int comp = 1;

        for (int i = 0; i < numbers.length; i++) {
            comp=comp*numbers[i];
        }
        System.out.println(comp);
    }
}
