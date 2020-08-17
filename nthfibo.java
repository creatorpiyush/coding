import java.util.Scanner;

/**
 * nthfibo
 */
public class nthfibo {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int s1 = 0, s2 = 1;
        int fibo = 0;
        for (int i = 2; i <= n; i++) {
            fibo = s1 + s2;
            s1 = s2;
            s2 = fibo;
        }
        System.out.println(fibo);

    }

}