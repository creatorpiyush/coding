package recursion.backtracking;

public class printMP {

    public static void main(String[] args) {

        PrintMP(2, 2, 0, 0, "");

    }

    public static void PrintMP(int er, int ec, int cr, int cc, String res) {

        if (er == cr && ec == cc) {
            System.out.println(res);
            return;
        }
        if (cr > er || cc > ec) {
            return;
        }

        PrintMP(er, ec, cr, cc + 1, res + "H");
        PrintMP(er, ec, cr + 1, cc, res + "V");

    }

}