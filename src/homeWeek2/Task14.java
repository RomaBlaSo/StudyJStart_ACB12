package homeWeek2;

import myUtils.ArrayUtils;

import java.util.Arrays;

/**
 * Created by roma on 28.11.2015.
 */
public class Task14 {
    public static void main(String[] args) {

//        Сдвинуть массив на заданное количество позиций // {1,2,3,4,5} -> 2 = {4,5,1,2,3}; {1,2,3,4,5} -> 3 = {3,4,5,1,2}
//        Количество позиций и массив указывает пользователь

        int counter = 3;
        int[] numbers = {1, 2, 3, 4, 5};//ArrayUtils.createRandomArray(25, 10);

//        for (int i = numbers.length - 1; counter != 0; i++, counter--){
//
//            int tmp = numbers[0];
//            numbers[0] = numbers[numbers.length - 1];
//
//            for (int j = 1; j < numbers.length - 1; j++){
//
//                //numbers[j]
//
//            }
//
//        }

        System.out.println(Arrays.toString(numbers));
    }
}
