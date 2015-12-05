package homeWeek2;

import myUtils.ArrayUtils;

import java.util.Scanner;

/**
 * Created by roma on 26.11.2015.
 */
public class Task4 {
    public static void main(String[] args) {

        //Посчитать сколько цифр (цифра задается пользователем) в массиве
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number:");
        int userNumber = sc.nextInt();
        int[] numbers = ArrayUtils.createRandomArray(100, 100);

        int counter = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == userNumber) {
                counter++;
            }
        }

        System.out.println("Count of digits:" + counter);

    }
}
