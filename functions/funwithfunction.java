import java.util.Scanner;

/**
 * funwithfunction
 */
public class funwithfunction {

    public static int a = 10, b = 20;

    public static void main(String[] args) {

        helloFun();
        helloGun();

        Scanner s = new Scanner(System.in);

        int p = s.nextInt(), r = s.nextInt(), t = s.nextInt();
        System.out.println(pi(p, r, t));

        s.nextLine();
        String name = s.nextLine();
        System.out.println(funwithname(name));

        swap(a, b);
        System.out.println(a + " " + b);// no change in value

    }

    public static void helloFun() {
        helloGun();
        System.out.println("Hello Fun...");
    }

    public static void helloGun() {
        System.out.println("Hello Gun...");
    }

    public static String funwithname(String name) {
        System.out.println(name);
        name = "anonymous";
        return name;
    }

    public static int pi(int p, int r, int t) {
        return p * r * t / 100;
    }

    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a + " " + b);
    }

}