package homeWeek1;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        //Пользователь вводит три числа с консоли, нужно вывести на консоль наибольшее, наименьшее
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите три числа:");
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        int number3 = sc.nextInt();

        System.out.println("Min. number: " + Math.min(Math.min(number1, number2), number3));
        System.out.println("Max. number: " + Math.max(Math.max(number1, number2), number3));

    }
}
