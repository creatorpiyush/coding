package twoDarrays;

public class demo {

    public static void main(String[] args) {

        /*
         * Method-1 for 2-D array => array/matrix in which all rows have same no. of
         * columns
         */

        int[][] arr;
        // System.out.println(arr); // ! shows error

        arr = new int[3][3];
        System.out.println(arr); // returns address of whole array

        System.out.println(arr[0]); // returns address of first row
        System.out.println(arr[1]); // returns address of first row
        System.out.println(arr[2]); // returns address of first row

        System.out.println(arr[0][0]); // returns element of array

        System.out.println(arr.length);
        System.out.println(arr[0].length);
        display(arr);

        /*
         *
         * Method-2 of 2-D array => array/matrix in which every row have different
         * dimension
         * 
         */

        arr = new int[3][]; // * 1-D type array
        System.out.println(arr[0]);// * output=> null

        arr[0] = new int[5];
        arr[1] = new int[2];
        arr[2] = new int[4];
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        display(arr);

    }

    public static void display(int[][] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }

}