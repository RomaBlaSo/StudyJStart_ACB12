package homeWeek2;

import myUtils.ArrayUtils;

import java.util.Arrays;

/**
 * Created by roma on 28.11.2015.
 */
public class Task4_10 {

    public static void main(String[] args) {

        int[] array1 = ArrayUtils.createRandomArray(10, 25);
        System.out.println(Arrays.toString(array1));

        System.out.println(Arrays.toString(ArrayUtils.splitArray(array1, 0, 5)));
        System.out.println(Arrays.toString(ArrayUtils.splitArray(array1, 0, 10)));
        System.out.println(Arrays.toString(ArrayUtils.splitArray(array1, 9, 10)));

    }
}
