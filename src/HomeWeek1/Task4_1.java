package HomeWeek1;

import java.util.Scanner;

/**
 * Created by roma on 18.11.2015.
 */
/*4.1. Пользователь вводит параметр с консоли (текущий час от 0 до 24)
Если время от 9 до 18, то выводим "Я на работе", в другом случае "Я отдыхаю")*/

public class Task4_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter current hour (0-24):");

        int currentHour = sc.nextInt();
        if (currentHour > 24){
            System.out.println("Invalid value");
        }
        else if (currentHour >= 9 && currentHour <= 18) {
            System.out.println("Я на работе");
        }
        else {
            System.out.println("Я отдыхаю");
        }

    }
}
