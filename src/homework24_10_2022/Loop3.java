package homework24_10_2022;

import java.util.Arrays;
import java.util.Random;

// заполнить массив задом на перед
public class Loop3 {
    public static void arrResult (int[] array) {
        int[] array1 = new int[array.length];
        for (int i = array.length -1 ; i > -1; i--) {
            array1[i] = new Random().nextInt(100);
        }
        System.out.println(Arrays.toString(array1));
    }

    public static void main(String[] args) {
        int[] array1 = new int[new Random().nextInt(50)];
        arrResult(array1);
    }
}
