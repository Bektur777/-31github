package sortings;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(selectionSort(new int[]{1, 3, 2, 4, 7, 0, 5, 10, 10, 1})));
    }

    static int[] selectionSort(int[] arr) {
        int lengthToCompare = arr.length;

        for (int i = 0; i < arr.length; i++) {
            int numberToCompare = 0;
            int indexNumber = 0;
            for (int j = 0; j < lengthToCompare; j++) {
                if (numberToCompare < arr[j]) {
                    numberToCompare = arr[j];
                    indexNumber = j;
                }
            }

            lengthToCompare--;
            arr[indexNumber] = arr[lengthToCompare];
            arr[lengthToCompare] = numberToCompare;
        }

        return arr;
    }

}
