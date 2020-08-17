import java.util.Scanner;

/**
 * factorial
 */
public class factorial {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        long fact = 1l;

        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        System.out.println(fact);

    }

}