package homeWeek3;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {

        //Написать метод, который проверяет является ли строка палиндромом
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter word:");
        String word = sc.nextLine();

        //word = "Sum summus mus";
        //word = "Saippuakivikauppias";

        int middle = word.length() / 2;
        boolean isPalendrome = true;
        for (int i = 0, j = word.length() - 1; i <= middle; i++, j--) {

            if (!word.substring(i, i + 1).equalsIgnoreCase(word.substring(j, j + 1))) {

                isPalendrome = false;
                break;

            }
        }

        System.out.println(word + " is " + isPalendrome);

    }
}
