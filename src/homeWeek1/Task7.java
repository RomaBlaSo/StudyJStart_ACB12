package homeWeek1;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {

        //Вводим два числа,
        //если одно из них делиться на другое без остатка, то выводим true и показываем результат деления (целую часть от деления  и остачу)
        //в другом случае выводим false и показываем результат деления (целую часть от деления  и остачу)
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two numbers:");
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();

        if (number2 == 0) {
            System.out.println("Zero");
            return;
        }

        int result = number1 / number2;
        int rest = number1 % number2;

        System.out.println("Without rest: " + (rest == 0 ? "true" : "false") + ". Result " + result + ". Rest " + rest);

    }
}
