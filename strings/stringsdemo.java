package strings;

/**
 * stringsdemo
 */
public class stringsdemo {

    public static void main(String[] args) {

        String str;
        // System.out.println(str); // ! error: as string is empty

        str = "Hello";
        System.out.println(str);
        System.out.println(str.length());

        System.out.println(str.charAt(0));
        System.out.println(str.charAt(str.length() - 1));

        System.out.println(str.substring(2, 4));
        System.out.println(str.substring(2, 3));
        System.out.println(str.substring(2, 2)); // * empty string
        System.out.println(str.substring(2));

        String s1 = "hi";
        String s2 = "Hello";
        String s3 = s1 + s2;
        System.out.println(s3);
        String s4 = s1.concat(s2);
        System.out.println(s4);

        System.out.println(str.indexOf("el"));
        System.out.println(str.indexOf("lo"));
        System.out.println(str.indexOf("eL")); // ! returns -1 if not found

        System.out.println(str.startsWith("He"));
        System.out.println(str.startsWith("he"));

        s1 = "Hello";
        s2 = s1;
        s3 = "Hello";
        s4 = new String("Hello");
        String s5 = "Hello";

        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s1 == s4);
        System.out.println(s1 == s5);
        System.out.println(s4 == s5);

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1.equals(s4));

    }

}