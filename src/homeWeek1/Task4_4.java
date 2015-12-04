package homeWeek1;

import java.util.Scanner;

public class Task4_4 {

    public static void main(String[] args) {

        //Вводим число с плавающей точкой с консоли, и проверяем лежит ли оно в диапазоне от 0 до 1

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter float number:");
        float number = sc.nextFloat();

        System.out.println(number > 0 && number < 1 ? "в диапазоне от 0 до 1" : number);

    }
}
