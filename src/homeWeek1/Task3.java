package homeWeek1;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        //Пользователь вводит число. Вывести на экран его удвоенное значение, если число делится на 7 нацело.
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number:");
        int number = sc.nextInt();

        System.out.println(number % 7 == 0 ? number * 2 : number);
    }
}
