package arrays.sorting;

public class selectionsort {

    public static void main(String[] args) {

        int[] arr = { 55, 44, 22, 33, 11 };

        int[] ans = selectionsort(arr);

        for (int value : ans) {
            System.out.print(value + " ");
        }
    }

    public static int[] selectionsort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }

            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }
}