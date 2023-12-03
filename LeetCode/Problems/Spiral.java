package Problems;

import java.util.Arrays;

/**
 * Given a positive integer n, generate an n x n matrix filled with elements from 1 to n2 in spiral order.
 *
 * Example 1:
 *
 * 1 2 3
 * 8 9 4
 * 7 6 5
 *
 * Input: n = 3
 * Output: [[1,2,3],[8,9,4],[7,6,5]]
 * Example 2:
 *
 * Input: n = 1
 * Output: [[1]]
 */

public class Spiral {

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(generateMatrix(3)));
    }

    static int[][] generateMatrix(int n) {
        int[][] spiral = new int[n][n];
        int top = 0, bottom = n - 1, left = 0, right = n - 1;
        int num = 1;

        while (top <= bottom && left <= right) {

            for (int i = left; i <= right; i++) {
                spiral[top][i] = num++;
            }
            top++;

            for (int i = top; i <= bottom; i++) {
                spiral[i][right] = num++;
            }
            right--;

            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    spiral[bottom][i] = num++;
                }
                bottom--;
            }

            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    spiral[i][left] = num++;
                }
                left++;
            }
        }

        return spiral;
    }
}
