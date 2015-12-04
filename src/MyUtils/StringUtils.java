package myUtils;

/**
 * Created by roma on 21.11.2015.
 */
public class StringUtils {

    public static void hello(String name) {

        System.out.println("Hello, " + name);

    }

    public static String kopeks(int sum) {

        String kopeks = "";
        if (sum >= 5 && sum <= 20) {
            kopeks = "копеек";
        } else {
            int d = sum % 10;
            kopeks = d == 1 ? "копейка" : d <= 4 ? "копейки" : "копеек";
        }

        return kopeks;

        //if(number > 20)
//        number %= 10;
//        switch(number)
//        {
//        case 1: std::cout << "копейка" << std::endl; break;
//        case 2:case 3: case 4: std::cout << "копейки " << std::endl; break;
//        case 5: case 6: case 7: case 8: case 9: case 10: case 11: case 12:
//        case 13: case 14: case 15: case 16: case 17:case 18: case 19:case 20:
//        std::cout << "копеек " << std::endl; break;

    }

}
