import java.util.Scanner;

/**
 * f_to_c
 */
public class f_to_c {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        double min = s.nextDouble();
        double max = s.nextDouble();
        double step = s.nextDouble();

        for (double f = min; f <= max; f += step) {
            double c = 5 * (f - 32) / 9;
            System.out.print(f);
            System.out.println("\t" + c);
        }

    }

}