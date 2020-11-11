public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(min(-20, -10));
        System.out.println(min(-40, -10, -30, 40));
        System.out.println(min(-100, -40, -30, 40));
        System.out.println(min(-20, -80, -40, 40));
        System.out.println(min(-20, -10, -70, -40));

    }

    public static int min(int a, int b) {
        if (a < b) return a;
        else return b;

    }

    public static int min(int a, int b, int c, int d) {
        if ((min(a, b) <=c)&&(min(a, b) <=d)) return min(a, b);
        if (c<=(min(a, b))&&c<=d) return c;
        else return d;
    }

}
