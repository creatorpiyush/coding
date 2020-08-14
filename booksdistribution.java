import java.util.Scanner;

/**
 * booksdistribution
 */

class fatorial {
    int n;
    long fact = 1l;

    public fatorial() {
        // this.n = 0;
    }

    public long fact(int n) {

        if (n == 1)
            return 0;
        if (n == 0)
            return 1;
        if (n == 2)
            return 1;

        return (n - 1) * (fact(n - 1) + fact(n - 2));

    }
}

public class booksdistribution {

    public static void main(String[] args) {

        fatorial fact = new fatorial();
        // System.out.println(fact.fact(5));

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        // long c = (fact.fact(n) / (fact.fact(1)));
        System.out.println(fact.fact(n));
    }

}