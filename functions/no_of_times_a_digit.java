import java.util.Scanner;

/**
 * Innerno_of_times_a_digit
 */
public class no_of_times_a_digit {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        long num = s.nextLong();
        int digit = s.nextInt();
        int count = 0;

        while (num != 0) {
            long d = num % 10;
            if (d == digit) {
                count++;
            }

            num /= 10;
        }
        System.out.println(count + " times");

    }

}