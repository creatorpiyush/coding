import java.util.Scanner;

/**
 * simpleintrest
 */
public class simpleintrest {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        double p = s.nextDouble();
        double r = s.nextDouble();
        double t = s.nextDouble();

        double si = (p * r * t) / 100;
        double amount = p + si;
        System.out.println("Simple intrest is " + si + " Rs");
        System.out.println("Net Amount is " + amount + " Rs");

    }

}