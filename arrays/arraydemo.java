package arrays;

import java.util.Scanner;

/**
 * arraydemo
 */
public class arraydemo {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int[] arr;
        // System.out.println(arr); // ! error as array is empty

        arr = new int[5];
        System.out.println(arr); // * prints memory address only

        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        System.out.println(arr);// * prints memory address only
        System.out.println(arr[0]);

        System.out.print("Input Array : ");
        for (int i = 0; i < 5; i++) {
            arr[i] = s.nextInt();
        }

        System.out.print("Output Array : ");
        for (int i : arr) {
            System.out.print(i + " ");
        }

    }

}