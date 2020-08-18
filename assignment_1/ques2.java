package assignment_1;

import java.util.Scanner;

/**
 * ques2
 */
public class ques2 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int reversed = 0;

        while (n != 0) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n /= 10;
        }

        System.out.println(reversed);

    }
}