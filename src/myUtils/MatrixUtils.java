package myUtils;

import java.util.Arrays;

/**
 * Created by roma on 28.11.2015.
 */
public class MatrixUtils {

    public static int[][] createAndFill(int rowsSize, int columnsSize) {

        int[][] matrix = new int[rowsSize][columnsSize];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = MathUtils.generateRandomDigit(10, 50);
            }
        }

        return matrix;
    }

    public static void show(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
    }

    public static int[][] sort(int[][] matrix){

        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = ArrayUtils.sortArray(matrix[i]);
        }

        return matrix;
    }

    public static int[][] sortColumns(int[][] matrix) {

        int countRows = matrix.length;
        int countColumns = matrix[0].length;

        for (int k = countColumns - 1; k >= 2; k--) {
            for (int j = 0; j < k; j++) {

                for (int l = countRows - 1; l >= 2; l--) {
                    for (int i = 0; i < l; i++) {

                        if (matrix[i][j] > matrix[i][j + 1]) {
                            int temp = matrix[i][j];
                            matrix[i][j] = matrix[i][j + 1];
                            matrix[i][j + 1] = temp;
                            //sorted = false;
                        }
                    }
                }
//                boolean sorted = true;
//
//                if (sorted) {
//                    break;
//                }
            }
        }

        return matrix;
    }
}
