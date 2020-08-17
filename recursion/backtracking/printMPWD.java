package recursion.backtracking;

public class printMPWD {

    public static void main(String[] args) {

        PrintMPWD(2, 2, 0, 0, "");

    }

    public static void PrintMPWD(int er, int ec, int cr, int cc, String res) {

        if (er == cr && ec == cc) {
            System.out.println(res);
            return;
        }
        if (cr > er || cc > ec) {
            return;
        }

        PrintMPWD(er, ec, cr + 1, cc, res + "H");
        PrintMPWD(er, ec, cr, cc + 1, res + "V");
        PrintMPWD(er, ec, cr + 1, cc + 1, res + "D");

    }

}