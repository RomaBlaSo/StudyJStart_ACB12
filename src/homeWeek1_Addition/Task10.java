package homeWeek1_Addition;

import myUtils.StringUtils;

import java.util.Scanner;

public class Task10 {

    public static void main(String[] args) {

        //Написать программу вычисления стоимости переговоров, если по субботам и воскресеньям предоставляется 20% скидка.
        //Ввести продолжительность разговора и день недели (цифра от 1 до 7).

        Scanner sc = new Scanner(System.in);

        System.out.println("Пожалуйста, введите день недели:");
        int day = sc.nextInt();
        if (day < 1 || day > 7) {
            return;
        }

        System.out.println("Пожалуйста, введите продолжительность разговора в минутах:");
        int duration = sc.nextInt();

        int price = 1;//грн в минуту
        int discount = 20;
        int sum = duration * price;

        int cost = sum * (100 - (day > 5 ? discount : 0));
        int kopeks = cost % 100;
        System.out.println("Стоимость: " + cost / 100 + "грн. " + kopeks + " " + StringUtils.kopeks(cost % 100));

    }
}
