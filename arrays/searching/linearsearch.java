package arrays.searching;

import java.util.Scanner;

public class linearsearch {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Enter size of array :  ");
        int n = s.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements of array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }
        int val = s.nextInt();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == val) {
                System.out.println(val + " found at : " + i + " index");
                break;
            } else {
                System.out.println("value not found...");
            }
        }

    }

}