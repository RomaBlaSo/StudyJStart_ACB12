package homeWeek3;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {

        //Напишите программу, которая позволяет пользователю ввести в консоли строку,
        //переводит первый символ слов в верхний регистр и результат выводит в консоль
        //Вход:
        //иван васильевич
        //Выход:
        //Иван Васильевич

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter sentence:");
        String sentence = sc.nextLine();

        if (sentence == ""){
            return;
        }

        String result = "";
        String[] words = sentence.split(" ");
        for (int i = 0; i < words.length; i++) {

            result += words[i].substring(0, 1).toUpperCase() + words[i].substring(1, words[i].length()) + " ";

        }

        System.out.println(result.trim());

    }
}
