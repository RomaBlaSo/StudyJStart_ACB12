package HomeWeek1_Addition;

import java.util.Scanner;

/**
 * Created by roma on 19.11.2015.
 */
public class Task6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //просим данные
        System.out.println("Пожалуйста, введите скорость (км/ч):");
        double speed = sc.nextInt();

        System.out.println("Пожалуйста, введите расстояние (км):");
        double distance = sc.nextInt();

        //считаем время
        double time = distance / speed;

        //окргулимся
        time = Math.round(time * Math.pow(10, 2)) / Math.pow(10, 2);

        //можно конечно минутки посчитать
        System.out.println("В пункт назначения я доберусь за " + time + "ч.");

        //тогда будет так:
        int timeHH = (int) time / 1;
        int timeMM = (int) Math.round(time % 1 * 60);
        System.out.println("В пункт назначения я доберусь за " + timeHH + "ч. " + timeMM + "мин.");

    }
}

//запилить в какой-нить свой класс, пока не шарю как :(
//вариант 1, быстрый, работает как-то не так
/*private static float round(float number, int scale) {
int pow = 10;
for (int i = 1; i < scale; i++)
    pow *= 10;
float tmp = number * pow;
return (float) (int) ((tmp - (int) tmp) >= 0.5f ? tmp + 1 : tmp) / pow;
//вариант 2, медленный
//Math.round(time * Math.pow(10, 2)) / Math.pow(10, 2))
*/