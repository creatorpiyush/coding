import java.util.Scanner;

/**
 * primeno
 */
public class primeno {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        boolean flag = false;

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                flag = true;
                break;
            }
        }

        if (flag) {
            System.out.println("Not a Prime No.");
        } else {
            System.out.println("Prime No.");
        }

    }

}