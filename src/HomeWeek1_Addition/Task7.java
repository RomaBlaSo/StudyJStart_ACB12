package homeWeek1_Addition;

import java.util.Scanner;

/**
 * Created by roma on 19.11.2015.
 */
public class Task7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //просим числа
        System.out.println("Пожалуйста, введите номер месяца:");
        int monthNumber = sc.nextInt();

        switch (monthNumber) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Вы ввели неправильный номер");
        }

    }
}

