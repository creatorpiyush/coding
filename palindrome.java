import java.util.Scanner;

/**
 * palindrome
 */
public class palindrome {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int main = n;
        int store = 0;

        while (n != 0) {

            int den = n % 10;
            store = store * 10 + den;
            n /= 10;
        }

        System.out.println(store);

        if (store == main) {
            System.out.println("Palindrome");
        } else {
            System.out.println("not Palindrome");
        }
    }

}