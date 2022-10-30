package homework24_10_2022;

import java.util.Arrays;
import java.util.Random;

public class Loop5 {
    public static void getArray(int[] array) {
        int[] massiv = new int[array.length];
        Random random = new Random();
        int i = 0;

        while (i < massiv.length) {
            massiv[i] = random.nextInt(55);
            if (massiv[i] % 2 > 0) {
                massiv[i] = massiv[i] + 1;
            }
            i++;
        }
        System.out.println(Arrays.toString(massiv));
    }

    public static void main(String[] args) {
        int[] array = new int[10];
        getArray(array);
    }
}


