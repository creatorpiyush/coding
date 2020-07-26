package recursion.backtracking;

public class countMPWD {

    public static void main(String[] args) {

        System.out.println(CountMPWD(2, 2, 0, 0));

    }

    public static int CountMPWD(int er, int ec, int cr, int cc) {

        if (er == cr && ec == cc) {
            return 1;
        }
        if (cr > er || cc > ec) {
            return 0;
        }

        int count = 0;
        int hcount = CountMPWD(er, ec, cr, cc + 1);
        int vcount = CountMPWD(er, ec, cr + 1, cc);
        int dcount = CountMPWD(er, ec, cr + 1, cc + 1);
        count = hcount + vcount + dcount;
        return count;

    }

}