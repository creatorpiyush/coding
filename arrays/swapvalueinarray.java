package arrays;

import java.util.Scanner;

public class swapvalueinarray {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("enter the size of array: ");
        int n = s.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }

        int i = 0, j = 2;
        System.out.println(arr[i] + "," + arr[j]);
        swap(arr, i, j);
        System.out.println("main function value after swap");
        System.out.println(arr[i] + "," + arr[j]);

    }

    public static void swap(int[] arr, int i, int j) {
        System.out.println(arr[i] + "," + arr[j]);
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        System.out.println(arr[i] + "," + arr[j]);
    }

}