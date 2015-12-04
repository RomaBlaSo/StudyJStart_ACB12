package homeWeek1_Addition;

public class Task14 {

    public static void main(String[] args) {

        //Определить, является ли шестизначное число "счастливым" (сумма первых трех цифр равна сумме последних трех цифр).

        int number = 783981;

        int left = number / 1000;
        int right = number % 1000;

        int sumLeft = left / 100 + left % 10 + (left / 10 % 10);
        int sumRight = right / 100 + right % 10 + (right / 10 % 10);

//        System.out.println(sumLeft);
//        System.out.println(sumRight);

        System.out.println(sumLeft==sumRight?"Lucky numbers":"Bad numbers");
    }

}
