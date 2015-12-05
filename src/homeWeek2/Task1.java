package homeWeek2;

import myUtils.ArrayUtils;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {

        //Найти минимальное и максимальное значения в массиве и вывести их на консоль
        int[] numbers = ArrayUtils.createRandomArray(10);

        int minIndex = ArrayUtils.findIndexMin(numbers);
        int maxIndex = ArrayUtils.findIndexMax(numbers);

        System.out.println("Array: " + Arrays.toString(numbers));

        System.out.println("Min value in array: " + numbers[minIndex]);
        System.out.println("Max value in array: " + numbers[maxIndex]);

    }
}
