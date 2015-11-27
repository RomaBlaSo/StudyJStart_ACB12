package HomeWeek2;

import MyUtils.ArrayUtils;

/**
 * Created by roma on 27.11.2015.
 */
public class Task4_7 {
    public static void main(String[] args) {

        //Вывести в консоль элементы той половины одномерного массива у которой среднее арифметическое максимальное
        int[] numbers = ArrayUtils.createRandomArray(101, 100);

        int middle = numbers.length / 2;

        long sum1 = 0;
        long sum2 = 0;
        for (int i = 0; i < middle; i++) {
            sum1 += numbers[i];
        }
        for (int i = middle; i < numbers.length; i++) {
            sum2 += numbers[i];
        }

        float avg1 = (float) sum1 / middle;
        float avg2 = (float) sum2 / (numbers.length - middle);

        System.out.println("Sum 1: " + sum1);
        System.out.println("Avg 1: " + avg1);
        System.out.println("Sum 2: " + sum2);
        System.out.println("Avg 2: " + avg2);

        if (avg1 > avg2) {

            //first middle
            for (int i = 0; i < middle; i++) {
                System.out.print(numbers[i] + " ");
            }

        } else {
            //second middle
            for (int i = middle; i < numbers.length; i++) {
                System.out.print(numbers[i] + " ");
            }
        }
    }
}
