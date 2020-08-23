package hackerearth;

import java.util.Scanner;

public class roy {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int l = s.nextInt();
        int t = s.nextInt();
        while (t != 0) {
            int w = s.nextInt();
            int h = s.nextInt();
            if (w < l || h < l)
                System.out.println("UPLOAD ANOTHER");
            else if (w == h)
                System.out.println("ACCEPTED");
            else
                System.out.println("CROP IT");
            t--;
        }

    }

}