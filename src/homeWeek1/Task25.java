package homeWeek1;

import myUtils.StringUtils;

import java.util.Scanner;

public class Task25 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Пожалуйста, введите число от 1 до 99:");
        int sum = sc.nextInt();

        System.out.println(sum > 99 ? "Введено неправильное значение" : sum + " " + StringUtils.kopeks(sum));

    }
}

