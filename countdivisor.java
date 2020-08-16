import java.util.Scanner;

public class countdivisor {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int l = s.nextInt();
        int r = s.nextInt();
        int k = s.nextInt();

        int count = 0;

        int i = l;

        while (i != r + 1) {
            if (i % k == 0) {
                count++;
            }
            i++;
        }

        System.out.println(count);
    }

}