package homeWeek1;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {

        //Вводим два числа, вывести их суму, если она в диапазоне от 11 до 19.
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two numbers:");
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        int sum = number1 + number2;

        System.out.println(sum >= 11 && sum <= 19 ? "Сумма чисел: " + sum : "Сумма вышла за рамки диапазона");

    }
}
