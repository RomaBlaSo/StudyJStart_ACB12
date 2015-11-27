package MyUtils;

/**
 * Created by roma on 21.11.2015.
 */
public class MathUtils {

    //public static <return_type(void - if nothing to return)><name_verb>(<input_type><input_name>){
//
//    logic
//
//return <args>;
//}

    public static double roundTo(double number, int degree){

        int pow = 10;
        for (int i = 1; i < degree; i++)
            pow *= 10;
        double tmp = number * pow;
        return (double) (int) ((tmp - (int) tmp) >= 0.5f ? tmp + 1 : tmp) / pow;

        //return Math.round(number * Math.pow(10, degree)) / Math.pow(10, degree);

    }

    public static int generateRandomDigit(int range){

        return (int) (Math.random() * range);

    }

    public static int generateRandomDigit(int minRange, int maxRange){

        return ((int) (Math.random()*(maxRange - minRange))) + minRange;

    }

}
