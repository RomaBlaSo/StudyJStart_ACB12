package homeWeek1;

import java.util.Scanner;

public class Task11 {

    public static void main(String[] args) {

        //Вычислить факториал числа.

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number:");

        int number = sc.nextInt();

        long factorial = 1;
        for (int i = number; i > 1 ; i--) {
            factorial *= i;
        }

        System.out.println(factorial);
    }
}
