package HomeWeek2;

import MyUtils.ArrayUtils;

import java.util.Arrays;

/**
 * Created by roma on 28.11.2015.
 */
public class Task7_1 {

    public static void main(String[] args) {

        //Инвертировать массив (без использования допольнительного массива)

        int[] array1 = ArrayUtils.createRandomArray(11, 25);
        System.out.println(Arrays.toString(array1));

        int MaxIndex = array1.length - 1;
        int middle = array1.length / 2;
        for (int i = 0; i < middle; i++) {

            int tmp = array1[i];
            array1[i] = array1[MaxIndex - i];
            array1[MaxIndex - i] = tmp;

        }

        System.out.println(Arrays.toString(array1));

    }
}
