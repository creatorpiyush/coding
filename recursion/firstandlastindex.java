package recursion;

public class firstandlastindex {

    public static void main(String[] args) {

        int[] arr = { 1, 3, 4, 5, 3, 4, 5 };
        // System.out.println(firstindex(arr, 0, 3));
        // System.out.println(lastindex(arr, 0, 4));
        int[] values = allindex(arr, 0, 3, 0);
        for (int value : values) {
            System.out.println(value);
        }

    }

    public static int firstindex(int[] arr, int n, int data) {

        if (n == arr.length) {
            return -1;
        }
        if (arr[n] == data) {
            return n;
        } else {
            return firstindex(arr, n + 1, data);
        }

    }

    public static int lastindex(int[] arr, int n, int data) {

        if (n == arr.length) {
            return -1;
        }
        int index = lastindex(arr, n + 1, data);
        if (index != -1) {
            return index;
        } else {
            if (arr[n] == data) {
                return n;
            } else
                return -1;

        }

    }

    public static int[] allindex(int[] arr, int i, int data, int count) {

        if (i == arr.length) {
            int[] br = new int[count];
            return br;
        }
        int[] indices = null;
        if (arr[i] == data) {
            indices = allindex(arr, i + 1, data, count + 1);
        } else {
            indices = allindex(arr, i + 1, data, count);
        }

        if (arr[i] == data) {
            indices[count] = i;
        }

        return indices;

    }

}