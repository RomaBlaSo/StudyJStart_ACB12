package homeWeek1;

import java.util.Scanner;

public class Task12 {

    public static void main(String[] args) {

        //Посчитать сколько раз встречается символ 8 в заданном числе, которое вводит юзер
        //5678  -   1
        //5889  -   2
        //8888  -   4
        //989990  - 1

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number:");
        int number = sc.nextInt();

        int rest = number, count = 0;

        while (rest != 0) {

            int tmp = rest % 10;
            if (tmp == 8){
                count++;
            }

            rest /= 10;

        }

        System.out.println(count);

    }

}
