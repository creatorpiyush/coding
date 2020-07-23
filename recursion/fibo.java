package recursion;

public class fibo {

    public static void main(String[] args) {

        System.out.println(fib(20));

    }

    public static int fib(int n) {

        if (n == 0 || n == 1) {
            return n;
        }

        int fibo = fib(n - 1) + fib(n - 2);
        return fibo;

    }
}