import java.util.*;

public class stringbuilder {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        System.out.println(sb);
        System.out.println(sb.toString());
        sb.append("y");
        System.out.println(sb);

        sb.append(s.next());
        System.out.println(sb);

        sb.setCharAt(1, 'i');
        System.out.println(sb);

        System.out.println(sb.charAt(0));

    }

}