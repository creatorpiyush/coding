package arrays;

import java.util.Scanner;

public class reverse_array {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int[] arr = takeinput();

        display(arr);

        System.out.println();
        System.out.println("Reversed array: ");
        reverse(arr);
        display(arr);

    }

    public static int[] takeinput() {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = s.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        return arr;
    }

    public static void display(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void reverse(int[] arr) {

        int beg = 0, end = arr.length - 1;
        while (beg <= end) {
            swap(arr, beg, end);
            beg++;
            end--;
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}