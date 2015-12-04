package homeWeek1_Addition;

import java.util.Scanner;

/**
 * Created by roma on 04.12.2015.
 */
public class Task12 {

    public static void main(String[] args) {

        //Написать программу, которая в зависимости от характера ветра выдает сообщение о его скорости:
        //от 1до 4 м/с - слабый (1); от 5-10 м/c - умеренный (2); от 11-18 м/c - сильный (3); больше 19 м/c - ураганный (4).

        Scanner sc = new Scanner(System.in);

        //просим характер ветра
        System.out.println("Пожалуйста, укажите характер ветра:");
        int wind = sc.nextInt();

        switch (wind) {
            case 1:
                System.out.println("Ветер от 1до 4 м/с - слабый");
                break;
            case 2:
                System.out.println("Ветер от 5-10 м/c - умеренный");
                break;
            case 3:
                System.out.println("Ветер от 11-18 м/c - сильный");
                break;
            case 4:
                System.out.println("Ветер больше 19 м/c - ураганный");
                break;
            default:
                System.out.println("Ветра нет");
        }

    }
}
