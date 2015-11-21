package Lessons;

import java.util.Scanner;

public class Lesson2 {
    public static void main(String[] args) {

//        System.out.println(Math.pow(4, 4));
//        System.out.println(Math.random());
//        System.out.println(Math.sqrt(225));
//
//
//
//        System.out.println("Enter age:");
//        int age = scanner.nextInt();
//
//        System.out.println("Enter name:");
//        String name = scanner.next();
//
//        System.out.println("My name " + name + ", age " + age);

        //tarnary operator

        Scanner sc = new Scanner(System.in);

        String name = "Vasya Pupkin";
        int age = 40;
        long money = 50_000;
        int tourPriceTurkey = 35_000;
        int tourPriceEgypt = 25_000;
        int tourPriceG = 100;
        int health = 10;
        int healthLimit = 30;
        boolean isWeatherGood = true;

        if (health > healthLimit){
            System.out.println("home");
        }
        else{
            System.out.println("I need a rest");
            if (money >= tourPriceTurkey && (sc.next()=="+")){
                System.out.println("Turkey");
            }
            else if(money >= tourPriceEgypt){
                System.out.println("Egypt");
            }
            else if(money >= tourPriceG){
                System.out.println("Grandma");
            }
            else{
                System.out.println("Stay at home");
            }

        }
    }
}
