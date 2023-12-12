package Sortings;

import java.util.Arrays;

public class QuickSort {

    static int[] arr = new int[] {27, 38, 12, 39, 27, 16};

    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortArray(0, arr.length)));
    }

    static int[] sortArray(int i, int j) {
        if (i == j) {
            return arr;
        }

        int pivot = partition(i, j); // [i, pivot - 1] < pivot // [pivot + 1, j] >= pivot
        sortArray(i, pivot);
        sortArray(pivot + 1, j);

        return arr;
    }

    static int partition(int i, int j) {
        int pivot = i;
        int s1 = i;

        for (int k = i + 1; k < j; k++) {
            if (arr[k] < arr[pivot]) {
                s1++;
                swap(s1, k);
            }
        }

        swap(pivot, s1);
        pivot = s1;

        return pivot;
    }

    static void swap(int i, int j) {
        int k = arr[j];
        arr[j] = arr[i];
        arr[i] = k;
    }

}
