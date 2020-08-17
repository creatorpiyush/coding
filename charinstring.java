import java.util.Scanner;

/**
 * charinstring
 */
public class charinstring {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        String str = s.nextLine();
        char find = s.next().charAt(0);
        boolean flag = false;
        int i;
        for (i = 0; i < str.length(); i++) {
            if (find == str.charAt(i)) {
                flag = true;
                break;
            }
        }

        if (flag) {
            System.out.println(find + " found at " + i + " index");
        } else
            System.out.println("Not found...");

    }

}