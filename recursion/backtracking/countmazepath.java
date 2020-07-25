package recursion.backtracking;

public class countmazepath {

    public static void main(String[] args) {

        System.out.println(CountMP(2, 2, 0, 0));

    }

    public static int CountMP(int endrow, int endcol, int currrow, int currcol) {

        if (endrow == currrow && endcol == currcol) {
            return 1;
        }
        if (currrow > endrow || currcol > endcol) {
            return 0;
        }

        int count = 0;
        int rcount = CountMP(endrow, endcol, currrow, currcol + 1);
        int dcount = CountMP(endrow, endcol, currrow + 1, currcol);
        count = rcount + dcount;
        return count;

    }

}