package strings;

public class insertascii {

    public static void main(String[] args) {

        String str = "acfpgs";

        StringBuilder sb = new StringBuilder();
        char prev = str.charAt(0);
        for (int i = 1; i < str.length(); i++) {
            char cc = str.charAt(i);
            sb.append(prev);
            sb.append(cc - prev);
            prev = cc;
        }
        sb.append(prev);

        System.out.println(sb);
    }

}