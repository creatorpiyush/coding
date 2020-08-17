package recursion;

public class pd_pi {

    public static void main(String[] args) {

        PD(10);
        System.out.println("===============");
        PI(10);
        System.out.println("===============");
        PDI(10);
        System.out.println("===============");
        PDISkip(10);
    }

    public static void PD(int n) {
        if (n == 0) {
            return;
        }

        System.out.println(n);
        PD(n - 1);
    }

    public static void PI(int n) {
        if (n == 0) {
            return;
        }

        PI(n - 1);
        System.out.println(n);

    }

    public static void PDI(int n) {
        if (n == 0) {
            return;
        }

        System.out.println(n);
        PDI(n - 1);
        System.out.println(n);
    }

    public static void PDISkip(int n) {
        if (n == 0) {
            return;
        }

        if (n % 2 == 1) {
            System.out.println(n);
        }
        PDISkip(n - 1);
        if (n % 2 == 0) {
            System.out.println(n);
        }
    }

}