package HomeWeek2;

import MyUtils.ArrayUtils;

import java.util.Arrays;

/**
 * Created by roma on 26.11.2015.
 */
public class Task4_3 {
    public static void main(String[] args) {

        //Заданы два массива одинаковой длинны с любыми значениями, скопировать данные из первого массива во второй

        int[] array1 = ArrayUtils.createRandomArray(10);
        int[] array2 = ArrayUtils.createRandomArray(10);

        ArrayUtils.copyArrayToArray(array1, array2);
        System.out.println("Array 1: " + Arrays.toString(array1));
        System.out.println("Array 2: " + Arrays.toString(array2));

    }

}
