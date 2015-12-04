package homeWeek3;

import myUtils.ArrayUtils;

import java.util.Scanner;

/**
 * Created by roma on 29.11.2015.
 */
public class Task2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter sentence:");
        String sentence = sc.nextLine();

        String[] words = sentence.split(" ");
        int minIndex = ArrayUtils.findIndexMin(words);
        int maxIndex = ArrayUtils.findIndexMax(words);

        System.out.printf("The longest word is %s, the shortest word is %s", words[minIndex], words[maxIndex]);

    }
}
