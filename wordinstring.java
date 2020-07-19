import java.util.Scanner;

/**
 * rwordinstring
 */
public class wordinstring {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        String str = s.nextLine();
        String find = s.nextLine();

        int word_index = str.indexOf(find);

        if (word_index == -1)
            System.out.println("Word not found...");
        else
            System.out.println(find + " found at " + word_index + " index");

    }

}