package homeWeek1;

import java.util.Scanner;

public class Task5_1 {
    public static void main(String[] args) {

        //Перевод с числа с десятичной системы счисления в двоичную, и наоборот. Пользователь сам вводит число

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number:");

        int number = sc.nextInt();
        System.out.println("You enter: " + number);

        String stringBin = "";
        while (number != 0) {

            int rest = number % 2;
            number /= 2;
            stringBin = rest + stringBin;

        }

        int i = 0, decimal = 0, bin = Integer.parseInt(stringBin);
        while (bin != 0) {

            int rest = bin % 10;
            bin /= 10;
            decimal += rest * Math.pow(2, i);

            i++;
        }

        System.out.println("Binary: " + stringBin);
        System.out.println("Decimal:  " + decimal);

    }

}