package HomeWeek2;

import MyUtils.ArrayUtils;

/**
 * Created by roma on 27.11.2015.
 */
public class Task4_6 {
    public static void main(String[] args) {

        //Найти среднее арифметическое массива
        int[] numbers = ArrayUtils.createRandomArray(100, 100);

        long sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + sum / numbers.length);
    }
}
