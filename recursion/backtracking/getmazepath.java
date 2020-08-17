package recursion.backtracking;

import java.util.ArrayList;

public class getmazepath {

    public static void main(String[] args) {

        System.out.println(getMP(2, 2, 0, 0));

    }

    public static ArrayList<String> getMP(int er, int ec, int cr, int cc) {

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
        ArrayList<String> hresult = getMP(er, ec, cr, cc + 1);
        ArrayList<String> vresult = getMP(er, ec, cr + 1, cc);

        for (int i = 0; i < hresult.size(); i++) {
            myResult.add("H" + hresult.get(i));
        }
        for (int i = 0; i < vresult.size(); i++) {
            myResult.add("V" + vresult.get(i));
        }

        return myResult;
    }

}