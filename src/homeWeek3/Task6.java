package homeWeek3;

import myUtils.MatrixUtils;

import java.util.Scanner;

public class Task6 {

    public static void main(String[] args) {

        //Создать логическую матрицу по следующим критериям, если і равно j, то элементом будет true.
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter quantity of rows:");
        int rows = sc.nextInt();

        System.out.println("Enter quantity of columns:");
        int columns = sc.nextInt();

        boolean[][] matrix = new boolean[rows][columns];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = i == j;
            }
        }

        MatrixUtils.show(matrix);

    }
}
