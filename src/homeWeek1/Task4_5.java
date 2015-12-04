package homeWeek1;

import java.util.Scanner;

public class Task4_5 {

    public static void main(String[] args) {

        //Вводим 2 числа. Если первое число больше второго, то вывести на экран разницу чисел.
        //Если второе больше, то выводим сумму.

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two numbers:");
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();

        System.out.println(number1 > number2 ? "Разница чисел: " + (number1 - number2) : number1 < number2 ? "Сумма чисел: " + (number1 + number2) : "Числа одинаковы");

    }

}
