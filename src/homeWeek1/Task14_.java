package homeWeek1;

import java.util.Arrays;
import java.util.Scanner;

public class Task14_ {

    public static void main(String[] args) {

        //Дано натуральное число A > 1. Определите, каким по счету числом Фибоначчи оно является, то есть выведите такое число n, что φn=A.
        //Если А не является числом Фибоначчи, выведите число -1.

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter count:");
        int count = sc.nextInt();

        int[] numbers = new int[count + 1];
        if (count < 2) {
            System.out.println(count);
            return;
        } else {
            numbers[0] = 0;
            numbers[1] = 1;
        }

        for (int i = 2; i <= count; i++) {

            numbers[i] = numbers[i - 1] + numbers[i - 2];

        }

        System.out.println(Arrays.toString(numbers));

    }
}
