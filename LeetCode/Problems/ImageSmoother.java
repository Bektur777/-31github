package Problems;

import java.util.Arrays;

public class ImageSmoother {

    public static void main(String[] args) {

        System.out.println(
            Arrays.deepToString(
                imageSmoother(new int[][]{{100, 200, 100}, {200, 50, 200}, {100, 200, 100}})
            )
        );

    }

    public static int[][] imageSmoother(int[][] img) {
        int m = img.length;
        int n = img[0].length;
        int[][] arr = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = getSmoothedValue(img, i, j);
            }
        }

        return arr;
    }

    static int getSmoothedValue(int[][] img, int row, int col) {
        int sum = 0;
        int count = 0;

        for (int i = row - 1; i <= row + 1; i++) {
            for (int j = col - 1; j <= col + 1; j++) {
                if (isValidCell(img, i, j)) {
                    sum += img[i][j];
                    count++;
                }
            }
        }

        return sum / count;
    }

    static boolean isValidCell(int[][] img, int row, int col) {
        return row >= 0 && row < img.length && col >= 0 && col < img[0].length;
    }

}
