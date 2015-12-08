package lessons;

import java.util.Scanner;

/**
 * Created by roma on 22.11.2015.
 */
public class Lesson4 {

    public static void main(String[] args) {

        System.out.println("Enter number:");
        Scanner sc = new Scanner(System.in);

        long number = sc.nextLong();
        long counter = 0;

        while (true){

            counter+=number%10==8?1:0;
            number/=10;
            if (number==0){break;}

        }

        System.out.println(counter);

        //String numberStr = "" + number;

        //String numberStr;
        //numberStr.toString()
        //System.out.println(numberStr.substring(1,2));

//        int[] array = ArrayUtils.createRandomArray(10);
//        ArrayUtils.showArray(array);

        //System.out.
    }

}
