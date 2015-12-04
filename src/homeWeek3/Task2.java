package homeWeek3;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

        //Напишите метод, заменяющий в строке все вхождения слова «бяка» на «вырезано цензурой».
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter sentence:");
        String sentence = sc.nextLine();

        //String sentence = "Поссорились как-то бяка и бука. На буку напала  Ужасная скука. А бяка устроила драку…";

        System.out.println(sentence.replaceAll("бяка", "*вырезано цензурой*"));

    }
}
