package homeWeek3;

import myUtils.StringUtils;

import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {

        //Ввести предложение с консоли, каждое четное слово инвертировать, в каждом нечетном слове удалить каждую четную букву.
        //Результат выводить на консоль.
        //Ввод:
        //Как решить это задание и не сломать себе голову?
        //Вывод:
        //каК ршт отэ здне и н ьтамолс сб ?уволог

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter sentence:");
        String sentence = sc.nextLine();

        //String sentence = "Как решить это задание и не сломать себе голову?";

        if (sentence == "") {
            return;
        }

        String result = "";
        String[] words = sentence.split(" ");
        for (int i = 0; i < words.length; i++) {

            result += (i % 2 == 0 ? StringUtils.inversion(words[i]) : StringUtils.deleteEvenLetters(words[i])) + " ";

        }

        System.out.println(result.trim());

    }
}