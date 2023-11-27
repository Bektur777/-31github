package sortings;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(bubbleSort(new int[]{3, 1, 2, 4, 7, 0, 5, 10, 10, 1})));
    }

    static int[] bubbleSort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            int numberToCompare;
            boolean isSorted = true;

            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    numberToCompare = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = numberToCompare;
                    isSorted = false;
                }
            }

            if (isSorted) {
                return arr;
            }
        }

        return arr;
    }
}
