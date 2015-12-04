package homeWeek1_Addition;

import java.util.Scanner;

/**
 * Created by roma on 19.11.2015.
 */
public class Task5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //просим число
        System.out.println("Пожалуйста, введите три числа:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a==b || a==c || b==c) {
            System.out.println("Что-то равно");
        } else {
            System.out.println("Равных нет");
        }

    }
}
