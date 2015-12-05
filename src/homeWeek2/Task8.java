package homeWeek2;

import myUtils.ArrayUtils;

import java.util.Arrays;

/**
 * Created by roma on 27.11.2015.
 */
public class Task8 {
    public static void main(String[] args) {

        //Eсть два массива одинаковой длины arr1 и arr2 вывести в консоль значения массива,
        //который получается в результате суммы arr1[i] + arr2[i]
        int[] array1 = ArrayUtils.createRandomArray(10, 10);
        int[] array2 = ArrayUtils.createRandomArray(10, 10);
        int[] arraySums = new int[array1.length];

        for (int i = 0; i < array1.length; i++) {

            arraySums[i] = array1[i] + array2[i];

        }

        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        System.out.println(Arrays.toString(arraySums));

    }
}
