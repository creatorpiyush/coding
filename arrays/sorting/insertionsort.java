package arrays.sorting;

import java.util.Arrays;

public class insertionsort {

    public static void main(String[] args) {

        int[] arr = { 55, 44, 33, 22, 11 };
        int[] ans = insertionsort(arr);
        for (int value : ans) {
            System.out.print(value + " ");
        }

        Arrays.sort(arr);

    }

    public static int[] insertionsort(int[] arr) {

        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }

        return arr;

    }

}