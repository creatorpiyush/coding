package hackerearth;

import java.util.Scanner;

public class emaze {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        int x = 0, y = 0;
        for (int i = 0; i < str.length(); i++) {
            char choice = str.charAt(i);
            switch (choice) {
                case 'L':
                    x -= 1;
                    break;
                case 'R':
                    x += 1;
                    break;
                case 'D':
                    y -= 1;
                    break;
                case 'U':
                    y += 1;
                    break;
                default:
                    break;
            }
        }
        System.out.println(x + " " + y);

    }

}