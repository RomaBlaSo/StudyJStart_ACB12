package homeWeek1_Addition;

import java.util.Scanner;

/**
 * Created by roma on 19.11.2015.
 */
public class Task4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //просим числа
        System.out.println("Пожалуйста, введите скорость (км/ч):");
        int speedKmH = sc.nextInt();

        System.out.println("Пожалуйста, введите скорость (м/с):");
        int speedMS = sc.nextInt();

        //пересчитаем, избегая деления на 60
        double speed = speedKmH * 60 / 1000;

        //а теперь сравним
        if (speed > speedMS) {
            System.out.println("Скорость " + speedKmH + "км/ч больше чем " + speedMS + "м/с");
        } else if (speed < speedMS) {
            System.out.println("Скорость " + speedMS + "м/с больше чем " + speedKmH + "км/ч");
        } else {
            System.out.println("Скорости равны");
        }
    }

}

