package HomeWeek1_Addition;

import java.util.Scanner;

/**
 * Created by roma on 19.11.2015.
 */
public class Task2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //просим числа
        System.out.println("Пожалуйста, введите три числа:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        //проверяем
        double x = a > 0 ? Math.pow(a, 3) : 0;
        double y = b > 0 ? Math.pow(b, 3) : 0;
        double z = c > 0 ? Math.pow(c, 3) : 0;

        //result
        System.out.println(a + " -> " + x);
        System.out.println(b + " -> " + y);
        System.out.println(c + " -> " + z);

    }
}
