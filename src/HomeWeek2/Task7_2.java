package homeWeek2;

import java.util.Arrays;

/**
 * Created by roma on 28.11.2015.
 */
public class Task7_2 {
    public static void main(String[] args) {

        int number = 211;
        int[] simpleNumbers = new int[number];

        int curIndex = 0;
        int curNumber = 2;
        boolean isSimple = false;

        while (curNumber <= number) {

            boolean curIsSimple = true;
            for (int i = 0; i < curIndex; i++) {

                if (curNumber % simpleNumbers[i] == 0) {

                    curIsSimple = false;
                    break;
                }
            }

            if (curIsSimple) {
                simpleNumbers[curIndex] = curNumber;
                curIndex++;
            }

            if (curIsSimple && curNumber == number) {
                isSimple = curIsSimple;
            }

            curNumber++;

        }

        System.out.println(isSimple);
        System.out.println(Arrays.toString(simpleNumbers));

    }
}
