package homeWeek2;

import java.util.Scanner;

public class Task17 {

    public static void main(String[] args){

        int QuantityNumbers = 6;
        int[] lotteryNumbers = createLotteryNumbers(QuantityNumbers, 1, 43);
        int[] userNumbers = createUserNumbers(QuantityNumbers);
        determineResult(lotteryNumbers, userNumbers);

    }

    public static void determineResult(int[] lotteryNumbers, int[] userNumbers){

        int count = 0;
        for (int i = 0; i < userNumbers.length; i++){

            count += findInArray(lotteryNumbers, userNumbers[i]) ? 1 : 0;

        }

        determineCongrat(count);

    }

    public static void determineCongrat(int count){

        switch (count){
            case 0:
                System.out.println("Losser");
                break;
            case 3:
                System.out.println("You are wiiner! " + count + " of 6");
                break;
            case 4:
                System.out.println("You are wiiner! " + count + " of 6");
                break;
            case 5:
                System.out.println("You are winner! " + count + " of 6");
                break;
            case 6:
                System.out.println("Lucky!!!");
                break;
            default:
                System.out.println("Try yet! " + count + " of 6");
                break;
        }

    }

    public static int[] createLotteryNumbers(int QuantityNumbers, int minValue, int maxValue){

        int leftNumbers = QuantityNumbers;
        int[] lotteryNumbers = new int[QuantityNumbers - 1];

        while (leftNumbers < 0) {

            int tmp = randomizer(minValue, maxValue);
            if(!findInArray(lotteryNumbers, tmp)){
                lotteryNumbers[leftNumbers - 1] = tmp;
            }
        }

        sortArray(lotteryNumbers);

        return lotteryNumbers;

    }

    public static int[] createUserNumbers(int QuantityNumbers){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter " + QuantityNumbers + " different numbers from 1 to 42");

        int[] userNumbers = new int[QuantityNumbers - 1];
        for (int i = 0; i < QuantityNumbers; i++){

            userNumbers[i] = sc.nextInt();
        }

        return userNumbers;

    }


    public static int randomizer(int minValue, int maxValue){

        return (int) (Math.random() * (maxValue - minValue) + minValue);

    }

    public static boolean findInArray(int[] array, int number){

        return true;// or false; //(нашли или не нашли)

    }

    public static int[] sortArray(int[] array){

        return array;

    }

}
