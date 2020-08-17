package recursion.backtracking;

import java.util.ArrayList;

public class getMPWD {

    public static void main(String[] args) {

        System.out.println(GetMPWD(2, 2, 0, 0));

    }

    public static ArrayList<String> GetMPWD(int er, int ec, int cr, int cc) {

        if (er == cr && ec == cc) {
            ArrayList<String> br = new ArrayList<>();
            br.add("");
            return br;
        }
        if (cr > er || cc > ec) {
            ArrayList<String> br = new ArrayList<>();
            return br;
        }

        ArrayList<String> myresult = new ArrayList<>();
        ArrayList<String> hresult = GetMPWD(er, ec, cr, cc + 1);
        ArrayList<String> vresult = GetMPWD(er, ec, cr + 1, cc);
        ArrayList<String> dresult = GetMPWD(er, ec, cr + 1, cc + 1);

        for (int i = 0; i < hresult.size(); i++) {
            myresult.add("H" + hresult.get(i));
        }

        for (int i = 0; i < vresult.size(); i++) {
            myresult.add("V" + vresult.get(i));
        }

        for (int i = 0; i < dresult.size(); i++) {
            myresult.add("D" + dresult.get(i));
        }

        return myresult;
    }

}