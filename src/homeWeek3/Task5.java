package homeWeek3;

import myUtils.MatrixUtils;

import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {

        //Заменить все числа, которые делятся на 5 без остачи в двухмерной матрице на 8
        int[][] matrix = MatrixUtils.createAndFill();
        MatrixUtils.show(matrix);

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {

                if (matrix[i][j] % 5 == 0) {

                    System.out.println(matrix[i][j] + " ---> 8");
                    matrix[i][j] = 8;

                }

            }
        }

        MatrixUtils.show(matrix);

    }
}
