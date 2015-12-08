package homeWeek1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        //Пользователь вводит параметр с консоли (текущий час от 0 до 24)
        //Если время от 9 до 18, то выводим "Я на работе", в другом случае "Я отдыхаю")
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter current hour (0-24):");

        int currentHour = sc.nextInt();
        System.out.println(currentHour > 24 ? "Invalid value" : currentHour >= 9 && currentHour <= 18 ? "Я на работе" : "Я отдыхаю");

    }
}
