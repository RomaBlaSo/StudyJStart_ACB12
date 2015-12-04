package homeWeek2;

import myUtils.ArrayUtils;

import java.util.Arrays;

/**
 * Created by roma on 27.11.2015.
 */
public class Task4_9 {
    public static void main(String[] args) {

        //Задать два массива случайными числами от 25 до 75. Определить у какого из массивов больше парных елементов.
        int[] array1 = ArrayUtils.createRandomArray(10, 25, 75);
        int[] array2 = ArrayUtils.createRandomArray(10, 25, 75);

        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));

        int counter1 = 0;
        int counter2 = 0;

        for (int i = 0; i < array1.length; i++) {

            if (array1[i] % 2 == 0) {
                counter1++;
            }
        }

        for (int i = 0; i < array2.length; i++) {

            if (array2[i] % 2 == 0) {
                counter2++;
            }
        }

        System.out.println(counter1 == counter2 ? "Четных элементов в обоих массивах одинаковое количество" : "Четных элементов больше в массиве #" + (counter1 > counter2 ? "1" : "2"));
    }
}
