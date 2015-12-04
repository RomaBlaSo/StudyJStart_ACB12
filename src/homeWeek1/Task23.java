package homeWeek1;

import java.util.Scanner;

/**
 * Created by roma on 19.11.2015.
 */
public class Task23 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //просим указать пол
        System.out.println("Пожалуйста, укажите пол буквой М или Ж:");
        String gender = sc.next();

        if (!gender.equals("М") && !gender.equals("Ж")) {
            System.out.println("Некорректно указан пол!");
            return;
        }

        //просим указать рост
        System.out.println("Пожалуйста, укажите ваш рост (см):");
        int height = sc.nextInt();

        double k1 = (gender == "М" ? 3.5 : 4.0);
        int k2 = gender == "М" ? 108 : 128;

        //Купер
        double idealWeight = 0.453 * (height * k1 / 2.54 - k2);
        System.out.println("Ваш идеальный вес: " + idealWeight);

        //просим указать вес
        System.out.println("Пожалуйста, укажите ваш вес (кг):");
        int weight = sc.nextInt();

        System.out.println(weight > idealWeight ? "Вам стоит похудеть" : "Кушайте больше");

    }
}
//            Расчет идеального веса по формуле Лоренца
//            Формула Лоренца (для расчета требуется знать только свой рост):
//            Идеальный вес = (рост (см) – 100) – (рост (см) – 150)/2
//
//            Пример расчета:
//            Рост = 168 см
//            Идеальный вес =  (168-100) - (168-150)/2 = 59 кг
//
//            Расчет идеального веса по формуле Купера
//            Идеальный вес для женщины (кг) : (рост (см) х 3,5 : 2,54 - 108) х 0,453.
//            Идеальный вес для мужчины (кг) : (рост (см) х 4,0 : 2,54 - 128) х 0,453.
//
//            Пример расчета (для женщины):
//            Рост = 168 см
//            Идеальный вес = (168 x 3,5 : 2,54 – 108) х 0,453 = 56 (кг)