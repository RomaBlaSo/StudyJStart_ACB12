package lessons;

import javafx.scene.transform.MatrixType;
import myUtils.MatrixUtils;

import java.sql.Array;
import java.util.Arrays;

/**
 * Created by roma on 28.11.2015.
 */
public class Lesson5 {
    public static void main(String[] args) {

//        int[][] matrix = MatrixUtils.createAndFill(10, 10);
//        MatrixUtils.sort(matrix);
//        MatrixUtils.show(matrix);
//        MatrixUtils.sortColumns(matrix);
//        MatrixUtils.show(matrix);
//
//        int num = 10;
//        System.out.println(factorial(num));

        Book book1 = new Book("Dostoevskiy", "Idiot", 500);
        Book book2 = new Book("Dostoevskiy", "Idiot", 500);
        Book book3 = new Book("Dostoevskiy", "Idiot", 500);

        Library library = new Library();
        library.fillBooks(book1, book2, book3);
        library.showBooks();

    }

    private static int factorial(int num) {

        return (num < 2 ? 1 : num * factorial(num - 1));
    }
}