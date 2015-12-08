package myUtils;

import java.util.Arrays;

public class ArrayUtils {

    public static void showArray(char[] array) {

        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }

    public static void showArray(int[] array) {

        //System.out.println(array);
        System.out.println(Arrays.toString(array));
//        for(int i = 0; i < array.length; i++){
//            System.out.println(array[i]);
//        }
    }

    public static void showArray(String[] array) {

        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }

    public static int[] copyArrayToArray(int[] array1, int[] array2) {

        if (array1.length == array2.length) {

            for (int i = 0; i < array1.length; i++) {

                array2[i] = array1[i];
            }
        } else {
            System.out.println("Error! Different length!");
        }

        return array2;
    }

    public static int[] createArray(int size) {

        int[] newArray = new int[size];
        for(int i = 0; i < size; i++){
            newArray[i] = i;
        }

        return newArray;
    }

    public static int[] createRandomArray(int size) {

        int[] newArray = new int[size];
        for(int i = 0; i < size; i++){
            newArray[i] = MathUtils.generateRandomDigit(1000000);
        }

        return newArray;
    }

    public static int[] createRandomArray(int size, int limit) {

        int[] newArray = new int[size];
        for(int i = 0; i < size; i++){
            newArray[i] = MathUtils.generateRandomDigit(limit);
        }

        return newArray;
    }

    public static int[] createRandomArray(int size, int minRandom, int maxRandom) {

        int[] newArray = new int[size];
        for(int i = 0; i < size; i++){
            newArray[i] = MathUtils.generateRandomDigit(minRandom, maxRandom);
        }

        return newArray;
    }

    public static int findIndexMin(int[] array) {

        if (array.length == 0) {
            return -1;
        }

        int minIndex = 0;
        int minValue = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < minValue) {
                minIndex = i;
                minValue = array[i];
            }
        }

        return minIndex;
    }

    public static int findIndexMin(String[] array) {

        if (array.length == 0) {
            return -1;
        }

        int minIndex = 0;
        int minValue = array[0].length();
        for (int i = 1; i < array.length; i++) {
            if (array[i].length() < minValue) {
                minIndex = i;
                minValue = array[i].length();
            }
        }

        return minIndex;
    }

    public static int findIndexMax(int[] array) {

        if (array.length == 0) {
            return -1;
        }

        int maxIndex = 0;
        int maxValue = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maxValue) {
                maxIndex = i;
                maxValue = array[i];
            }
        }

        return maxIndex;
    }

    public static int findIndexMax(String[] array) {

        if (array.length == 0) {
            return -1;
        }

        int maxIndex = 0;
        int maxValue = array[0].length();
        for (int i = 1; i < array.length; i++) {
            if (array[i].length() > maxValue) {
                maxIndex = i;
                maxValue = array[i].length();
            }
        }

        return maxIndex;
    }

    public static int[] splitArray(int[] arr, int start, int end) {

        // обрезать массив по границам start и end
        int[] newArray = new int[end == start ? 1 : end - start];

        int counter = 0;
        for (int i = start; i < end; i++) {
            newArray[counter] = arr[i];
            counter++;
        }

        return newArray;
    }

    public static int[] sortArray(int[] array) {
        //пузырек, разобраться и дописать

        for (int i = array.length - 1; i >= 2; i--) {

            boolean sorted = true;

            for (int j = 0; j < i; j++) {

                if (array[j] > array[j + 1]) {

                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    sorted = false;

                }
            }

            if (sorted) {
                break;
            }
        }

        return array;
    }

}
