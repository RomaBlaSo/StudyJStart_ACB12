package homeWeek1;

import java.util.Scanner;

/**
 * Created by roma on 19.11.2015.
 */
public class Task17 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //просим число
        System.out.println("Пожалуйста, введите трехзначное число:");
        int a = sc.nextInt();

        if (a < 100 || a > 999) {
            System.out.println("Вы ввели не совсем трехзначное число");
            return;
        }

        int a1 = a / 100;
        int a2 = a % 100 / 10;
        int a3 = a % 10;

        //сравним
        boolean b1 = a1 == a2;
        boolean b2 = a2 == a3;
        boolean b3 = a1 == a3;

        if (b1 && b2 && b3) {
            System.out.println("Все цифры одинаковые");
        } else if (b1 || b2 || b3) {
            System.out.println("Некоторые цифры одинаковые");
        } else {
            System.out.println("Одинаковых цифр нет");
        }

    }
}
