package hackerearth;

import java.util.Scanner;

public class motupatlu {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt(), m = 0, p = 0, c;
        c = n;
        for (int i = 1; i <= n; i++) {
            p = p + i;
            m = m + i * 2;
            c = c - i - i * 2;
            if (p + m < n && c < i) {
                System.out.println("Patlu");
                System.exit(0);
            }
        }
        System.out.println("Motu");

    }

}