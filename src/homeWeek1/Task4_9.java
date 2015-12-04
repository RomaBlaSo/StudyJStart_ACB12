package homeWeek1;

import java.util.Scanner;

public class Task4_9 {
    public static void main(String[] args) {

        //Посчитать сколько раз встречается символ 5 в заданном числе, которое вводит юзер
        //435  -   1
        //505  -   2
        //555  -   3
        //305    - 1

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number:");
        int number = sc.nextInt();

        int digit1 = number / 100;
        int digit2 = number / 10 % 10;
        int digit3 = number % 10;

        int count = (digit1 == 5 ? 1 : 0) + (digit2 == 5 ? 1 : 0) + (digit3 == 5 ? 1 : 0);
        System.out.println(count);

    }
}
