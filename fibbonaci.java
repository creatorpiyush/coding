import java.util.Scanner;

/**
 * fibbonaci
 */
public class fibbonaci {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int s1 = 0, s2 = 1;
        System.out.print(s1 + " " + s2 + " ");
        for (int i = 2; i < n; i++) {
            int s3 = s1 + s2;
            System.out.print(s3 + " ");
            s1 = s2;
            s2 = s3;
        }

    }
}