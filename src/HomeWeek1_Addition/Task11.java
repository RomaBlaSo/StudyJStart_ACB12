package homeWeek1_Addition;

import java.util.Scanner;

/**
 * Created by roma on 20.11.2015.
 */
public class Task11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String kops = "";

        System.out.println("Пожалуйста, введите число от 1 до 99:");
        int a = sc.nextInt();

        if (a > 99) {
            System.out.println("Введено неправильное значение");
            return;
        }

        if (a >= 5 && a <= 20) {
            kops = " копеек";
        } else {
            int d = a % 10;
            kops = d == 1 ? " копейка" : d <= 4 ? " копейки" : " копеек";
        }
        System.out.println(a + kops);
    }
}

//if(number > 20)
//        number %= 10;
//        switch(number)
//        {
//        case 1: std::cout << "копейка" << std::endl; break;
//        case 2:case 3: case 4: std::cout << "копейки " << std::endl; break;
//        case 5: case 6: case 7: case 8: case 9: case 10: case 11: case 12:
//        case 13: case 14: case 15: case 16: case 17:case 18: case 19:case 20:
//        std::cout << "копеек " << std::endl; break;

