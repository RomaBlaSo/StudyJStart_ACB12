package homeWeek1;

import java.util.Scanner;

/**
 * Created by roma on 19.11.2015.
 */
public class Task22 {
    public static void main(String[] args) {

        double discount = 10;//10%
        int limit = 1000;

        Scanner sc = new Scanner(System.in);

        //просим число
        System.out.println("Пожалуйста, укажите вашу стоимость покупки:");
        double sum = sc.nextDouble();

        if (sum <= limit) {
            System.out.println("Не полагается вам скидочка");
            System.out.println("Ваша стоимость покупки составила: " + sum);
        } else {

            double sumDisc = sum * discount / 100;
            sumDisc = Math.round(sumDisc * Math.pow(10, 2)) / Math.pow(10, 2);

            double sumWithDisc = sum - sumDisc;

            System.out.println("Ваша скидка: " + sumDisc);
            System.out.println("Ваша стоимость покупки составила: " + sumWithDisc);
        }

    }
}
