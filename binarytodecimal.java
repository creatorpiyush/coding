import java.util.Scanner;

/**
 * binarytodecimal
 */
public class binarytodecimal {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int dec = 0;
        int bin = s.nextInt();
        int twopowers = 1;
        while (bin != 0) {
            int rem = bin % 10;
            dec = dec + rem * twopowers;
            twopowers = twopowers * 2;
            bin /= 10;
        }
        System.out.println(dec);

    }

}