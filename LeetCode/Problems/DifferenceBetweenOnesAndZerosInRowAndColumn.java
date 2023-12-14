package Problems;

import java.util.Arrays;

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

        for (int i = 0; i < grid.length; i++) {

            for (int j = 0; j < grid[i].length; j++) {
                grid[i][j] = onesOrZerosRow(grid, i, 1) +
                        onesOrZerosColumn(grid, j, 1) -
                        onesOrZerosRow(grid, i, 0) -
                        onesOrZerosColumn(grid, j, 0);
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
