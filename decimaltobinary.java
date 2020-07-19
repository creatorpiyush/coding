import java.util.Scanner;

/**
 * decimaltobinary
 */
public class decimaltobinary {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int dec = s.nextInt();
        int bin = 0;
        int tenpowers = 1;
        while (dec != 0) {
            int rem = dec % 2;
            bin = bin + rem * tenpowers;
            tenpowers *= 10;
            dec /= 2;
        }

        System.out.println(bin);

    }

}