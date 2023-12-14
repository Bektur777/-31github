package Problems;

import java.util.Arrays;

/**
 * You are given a 0-indexed m x n binary matrix grid.
 *
 * A 0-indexed m x n difference matrix diff is created with the following procedure:
 *
 * Let the number of ones in the ith row be onesRowi.
 * Let the number of ones in the jth column be onesColj.
 * Let the number of zeros in the ith row be zerosRowi.
 * Let the number of zeros in the jth column be zerosColj.
 * diff[i][j] = onesRowi + onesColj - zerosRowi - zerosColj
 * Return the difference matrix diff.
 *
 *
 *
 * Example 1:
 *
 * Input: grid = [[0,1,1],[1,0,1],[0,0,1]]
 * Output: [[0,0,4],[0,0,4],[-2,-2,2]]
 * Explanation:
 * - diff[0][0] = onesRow0 + onesCol0 - zerosRow0 - zerosCol0 = 2 + 1 - 1 - 2 = 0
 * - diff[0][1] = onesRow0 + onesCol1 - zerosRow0 - zerosCol1 = 2 + 1 - 1 - 2 = 0
 * - diff[0][2] = onesRow0 + onesCol2 - zerosRow0 - zerosCol2 = 2 + 3 - 1 - 0 = 4
 * - diff[1][0] = onesRow1 + onesCol0 - zerosRow1 - zerosCol0 = 2 + 1 - 1 - 2 = 0
 * - diff[1][1] = onesRow1 + onesCol1 - zerosRow1 - zerosCol1 = 2 + 1 - 1 - 2 = 0
 * - diff[1][2] = onesRow1 + onesCol2 - zerosRow1 - zerosCol2 = 2 + 3 - 1 - 0 = 4
 * - diff[2][0] = onesRow2 + onesCol0 - zerosRow2 - zerosCol0 = 1 + 1 - 2 - 2 = -2
 * - diff[2][1] = onesRow2 + onesCol1 - zerosRow2 - zerosCol1 = 1 + 1 - 2 - 2 = -2
 * - diff[2][2] = onesRow2 + onesCol2 - zerosRow2 - zerosCol2 = 1 + 3 - 2 - 0 = 2
 */

public class DifferenceBetweenOnesAndZerosInRowAndColumn {

    public static void main(String[] args) {

        System.out.println(
                Arrays.deepToString(
                        onesMinusZeros(new int[][] {
                                        {0, 1, 1},
                                        {1, 0, 1},
                                        {0, 0, 1}
                                }
                        )
                )
        );

    }

    static int[][] onesMinusZeros(int[][] grid) {
        int[] onesCol = new int[grid[0].length];
        int[] zerosCol = new int[grid[0].length];

        for (int i = 0; i < grid[0].length; i++) {
            onesCol[i] = onesOrZerosColumn(grid, i, 1);
            zerosCol[i] = onesOrZerosColumn(grid, i, 0);
        }

        for (int i = 0; i < grid.length; i++) {
            int onesRow = onesOrZerosRow(grid, i, 1);
            int zerosRow = onesOrZerosRow(grid, i, 0);

            for (int j = 0; j < grid[i].length; j++) {

                grid[i][j] = onesRow + onesCol[j] - zerosRow - zerosCol[j];
            }

        }

        return grid;
    }

    static int onesOrZerosRow(int[][] mat, int index, int onesOrZeros) {
        int count = 0;

        for (int i = 0; i < mat[0].length; i++) {
            if (mat[index][i] == onesOrZeros) {
                count++;
            }
        }

        return count;
    }

    static int onesOrZerosColumn(int[][] mat, int index, int onesOrZeros) {
        int count = 0;

        for (int i = 0; i < mat.length; i++) {

            if (mat[i][index] == onesOrZeros) {
                count++;
            }

        }

        return count;
    }

}
