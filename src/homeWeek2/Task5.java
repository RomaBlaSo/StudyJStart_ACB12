package homeWeek2;

import myUtils.MathUtils;

import java.util.Arrays;

/**
 * Created by roma on 27.11.2015.
 */
public class Task5 {
    public static void main(String[] args) {

        //Заполнить массив случайными значениями. На четных индексах парные значения, на нечетных непарные
        int sizeArray = 20;
        int limit = 100;

        int[] newArray = new int[sizeArray];
        for (int i = 0; i < sizeArray; i++) {

            int rest = i % 2;

            while (true) {
                int tmp = MathUtils.generateRandomDigit(limit);
                if (rest == tmp % 2) {
                    newArray[i] = tmp;
                    break;
                }
            }

        }

        System.out.println("Array 1: " + Arrays.toString(newArray));

    }
}
