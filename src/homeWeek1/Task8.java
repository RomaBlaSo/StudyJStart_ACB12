package homeWeek1;

import java.util.Scanner;

public class Task8 {

    public static void main(String[] args) {

        //Вводим два числа, сравнить последнии цифры этих чисел (пользоваться оператором %)
        //124    4    -   true
        //1456   567  -   false
        //1      2    -   false
        //18     98   -   true

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two numbers:");
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();

        System.out.println(number1 % 10 == number2 % 10 ? "true" : "false");

    }
}
