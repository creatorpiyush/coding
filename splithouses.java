import java.util.Scanner;

public class splithouses {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        String str = s.next();

        int flag = 0;
        if (str.contains("HH")) {
            System.out.println("NO");
            return;
        } else {
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == '.') {
                    str = str.replace(".", "B");
                }
            }
        }
        if (flag == 0) {
            System.out.println("Yes");
            System.out.println(str);
        }

    }

}