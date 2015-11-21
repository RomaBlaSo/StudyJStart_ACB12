package Lessons;

/**
 * Created by roma on 14.11.2015.
 */
public class Lesson1 {
    public static void main(String[] args) {

        int age = 222;
        byte smallNum = (byte) age;
        long bigNumber = 7684783567834653489L;
        double cost = 24.8;
        float newCost = (float) 24.8;
        char symbol1 = 'R';
        char symbol2 = 'O';
        char symbol3 = 'M';
        char symbol4 = 'A';

        //System.out.println(symbol1 + "" + symbol2 + "" + symbol3 + "" + symbol4);
        System.out.println(symbol1 + ' ' + symbol2 + ' ' + symbol3 + ' ' + symbol4);
        System.out.println(symbol1 + "" + symbol2 + "" + symbol3 + "" + symbol4);

        String myName = "R O M A";
        System.out.println(myName);

        //System.out.println(bigNumber);
        //System.out.println(smallNum);

        int d = 100;
        int e = 8;
        System.out.println(d/e);
        System.out.println(d%e);
        System.out.println((float)d/e);

        int i = 2;
        int j = 2;
        String sum = i + " + " + j + " = " + (i + j);
        System.out.println(sum);

    }

}
