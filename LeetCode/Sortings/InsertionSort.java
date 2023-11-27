package sortings;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(insertionSort(new int[]{1, 3, 2, 4, 7, 5, 10})));
    }

    static int[] insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int currentNumber = arr[i];
            int numberToCompare = i - 1;
            while (numberToCompare >= 0 && arr[numberToCompare] > currentNumber) {
                arr[numberToCompare + 1] = arr[numberToCompare];
                numberToCompare--;
            }

            arr[numberToCompare + 1] = currentNumber;
        }
        return arr;
    }
}
