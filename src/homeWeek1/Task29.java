package homeWeek1;

public class Task29 {

    public static void main(String[] args) {

        //Известны площади круга и квадрата. Определить: а) уместится ли круг в квадрат; б) уместится ли квадрат в круге.

        int sqCircle = 100;
        int sqSquare = 100;

        //можно посчитать через соотношение стороны квадрата и радиуса

        //Площадь круга: S = пи * R^2 //(Где S — площадь круга, R — радиус круга)
        //Площадь квадрата:  S = a^2

        //нужен радиус
        double radius = Math.sqrt(sqCircle / Math.PI);
        double side = Math.sqrt(sqSquare);

        //Площадь круга вписанного в квадрат: S = пи * (a / 2)^2 //Где a/2 — радиус круга, a — длина стороны квадрата.
        double sqCalc = Math.PI * Math.pow((side / 2), 2);
        System.out.println("Площадь круга вписанного в квадрат должна быть не более: " + sqCalc);
        System.out.println(sqCalc >= sqCircle ? "Круг в квадрате" : "Маленький квадрат");

        //Площадь круга описанного около квадрата: S = пи * 0.5*a^2 //Где a — длина стороны квадрата.

        double sqCalc2 = Math.PI * 0.5 * Math.pow(side, 2);
        System.out.println("Площадь круга описанного вокруг квадрата должна быть не меньше: " + sqCalc2);
        System.out.println(sqCalc2 <= sqCircle ? "Квадрат в круге" : "Маленький круг");

    }
}