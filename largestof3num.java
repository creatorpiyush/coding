import java.util.Scanner;

/**
 * largestof3num
 */
public class largestof3num {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int one = s.nextInt(), two = s.nextInt(), three = s.nextInt();

        if (one >= two && one >= three) {
            System.out.println(one);
        } else {
            if (two >= one && two >= three) {
                System.out.println(two);
            } else {
                System.out.println(three);
            }
        }

    }

}