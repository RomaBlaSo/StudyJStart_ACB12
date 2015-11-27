package HomeWeek2;

import MyUtils.ArrayUtils;

import java.util.Arrays;

public class Task4_2 {
    public static void main(String[] args) {

        //Поменять местами наибольший и наименьший элементы в массиве
        int[] numbers = ArrayUtils.createRandomArray(10);

        int minIndex = ArrayUtils.findIndexMin(numbers);
        int maxIndex = ArrayUtils.findIndexMax(numbers);

        if (minIndex != maxIndex) {

            System.out.println("Min value in array: " + numbers[minIndex]);
            System.out.println("Max value in array: " + numbers[maxIndex]);

            System.out.println("Array before: " + Arrays.toString(numbers));

            int tmp = numbers[minIndex];
            numbers[minIndex] = numbers[maxIndex];
            numbers[maxIndex] = tmp;

            System.out.println("Array after: " + Arrays.toString(numbers));

        } else {
            System.out.println("Array: " + Arrays.toString(numbers));
            System.out.println("Все элементы в массиве одинаковые");
        }
    }
}
