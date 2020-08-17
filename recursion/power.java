package recursion;

public class power {

    public static void main(String[] args) {

        System.out.println(power(2, 5));

    }

    public static int power(int x, int n) {

        if (n == 0) {
            return 1;
        }

        int pow = x * power(x, n - 1);
        return pow;

    }

}