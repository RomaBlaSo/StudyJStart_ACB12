package homeWeek2;

import java.util.Arrays;

/**
 * Created by roma on 28.11.2015.
 */
public class Task7_3 {

    public static void main(String[] args) {

        //Посчитать колличество букв 'a' в строке (искомый символ может быть разным)
        char letter = 'a';
        String abrval = "gajksdguiUIHIAAAAajjasa";

        char[] arrayChars = abrval.toCharArray();
        System.out.println(Arrays.toString(arrayChars));

        int counter = 0;
        for (char i : arrayChars) {

            if (i == letter) {
                counter++;
            }
        }

        System.out.println("Count of " + letter + " is " + counter);
    }
}
