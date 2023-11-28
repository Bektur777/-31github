package sortings;

import java.util.Arrays;

public class CountingSort {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(countingSort(new int[]{3, 4, 7, 5, 10, 3, 11})));
    }

    static int[] countingSort(int[] arr) {
        int minNum = arr[0];
        int maxNum = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (maxNum < arr[i]) {
                maxNum = arr[i];
            }
            if (minNum > arr[i]) {
                minNum = arr[i];
            }
        }

        int[] bucket = new int[maxNum - minNum + 1];

        for (int i = 0; i < arr.length; i++) {
            bucket[arr[i] - minNum]++;
        }

        int numIndex = 0;
        for (int i = 0; i < bucket.length; i++) {
            for (int j = bucket[i]; j > 0; j--) {
                arr[numIndex++] = i + minNum;
            }
        }

        return arr;
    }
}
