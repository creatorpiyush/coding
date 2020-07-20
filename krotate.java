/**
 * krotate
 */
public class krotate {

    public static void main(String[] args) {

        int n = 198754;
        int k = 1;

        int num = n;
        int nod = 0;
        while (num != 0) {
            nod++;
            num /= 10;
        }

        k %= nod;

        if (k < 0) {
            k += nod;
        }

        int divisor = (int) Math.pow(10, k);
        int rem = n % divisor;
        n /= divisor;
        int ans = rem * (int) Math.pow(10, nod - k) + n;
        System.out.println(ans);

    }

}