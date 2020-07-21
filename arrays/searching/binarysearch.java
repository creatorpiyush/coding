package arrays.searching;

import java.util.*;

public class binarysearch {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Enter size of array : ");
        int n = s.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        int value = s.nextInt();

        if (binarysearch(arr, value, 0, arr.length) == -1) {
            System.out.println(value + " not found...");
        } else
            System.out.println(value + " Found at " + binarysearch(arr, value, 0, arr.length) + " index.");

    }

    public static int binarysearch(int[] arr, int value, int beg, int end) {

        while (beg <= end) {
            int mid = (beg + end) / 2;

            if (arr[mid] == value) {
                return mid;
            } else if (arr[mid] > value) {
                end = mid - 1;
            } else if (arr[mid] < value) {
                beg = mid + 1;
            }
        }

        return -1;

    }
}