package homeWeek1;

import myUtils.ArrayUtils;

import java.util.Arrays;
import java.util.Scanner;

public class Task13 {

    public static void main(String[] args) {

        //Последовательность Фибоначчи определяется так:
        //φ0=0,  φ1=1, ..., φn=φn-1+φn-2.
        //По данному числу n определите n-е число Фибоначчи φn.

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
