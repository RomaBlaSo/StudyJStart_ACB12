package homeWeek1;

import java.util.Scanner;

/**
 * Created by roma on 19.11.2015.
 */
public class Task15 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //просим числа
        System.out.println("Пожалуйста, введите стороны треугольника:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        //стороны
        int k1 = 0, k2 = 0, h = Math.max(a, b);

        //найдем гипотенузу
        if (h > c) {
            k1 = c;
            k2 = Math.min(a, b);
        } else {
            h = c;
            k1 = a;
            k2 = b;
        }

        //собственно теорема Пифагора
        boolean isSq = Math.pow(h, 2) == (Math.pow(k1, 2) + Math.pow(k2, 2));
        System.out.println(isSq ? "Он квадратный" : "Не квадратный");

    }
}
