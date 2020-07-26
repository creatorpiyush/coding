package recursion.backtracking;

import java.util.ArrayList;

public class printmazepath {

    public static void main(String[] args) {

        System.out.println(printMP(2, 2, 0, 0));

    }

    public static ArrayList<String> printMP(int er, int ec, int cr, int cc) {

        if (er == cr && ec == cc) {
            ArrayList<String> br = new ArrayList<>();
            br.add("");
            return br;
        }

        if (cr > er || cc > ec) {
            ArrayList<String> br = new ArrayList<>();
            return br;
        }

        ArrayList<String> myResult = new ArrayList<>();
        ArrayList<String> hresult = printMP(er, ec, cr, cc + 1);
        ArrayList<String> vresult = printMP(er, ec, cr + 1, cc);

        for (int i = 0; i < hresult.size(); i++) {
            myResult.add("H" + hresult.get(i));
        }
        for (int i = 0; i < vresult.size(); i++) {
            myResult.add("V" + vresult.get(i));
        }

        return myResult;
    }

}