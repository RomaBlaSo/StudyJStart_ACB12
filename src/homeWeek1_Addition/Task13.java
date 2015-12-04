package homeWeek1_Addition;

import java.util.Scanner;

public class Task13 {

    public static void main(String[] args) {

        //Даны три числа A,B,C. Увеличить числа в два раза, если A+B+C>0, в противном случае заменить на нули.
        Scanner sc = new Scanner(System.in);

        System.out.println("Укажите три числа:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a + b + c > 0) {

            a *= 2;
            b *= 2;
            c *= 2;

        } else {
            a = 0;
            b = 0;
            c = 0;
        }

        System.out.println("A = " + a);
        System.out.println("B = " + b);
        System.out.println("C = " + c);
    }

}
