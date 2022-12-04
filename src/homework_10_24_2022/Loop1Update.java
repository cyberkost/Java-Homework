package homework_10_24_2022;

import java.util.Arrays;
import java.util.Random;

public class Loop1Update {
    public static void getArray(int[] array1, int[] array2, int[] array3) {
        Random random = new Random();
        int check = 5;

        int[] massiv1 = new int[array1.length];
        int[] massiv2 = new int[array2.length];
        int[] massiv3 = new int[array3.length];

        if (massiv1.length == check) {
            System.out.println("Если длина массива равна 5, то заполняем рандомными числами");
            for (int i = 0; i < massiv1.length; i++) {
                massiv1[i] = new Random().nextInt(50);
            }
            System.out.println(Arrays.toString(massiv1));
        }

        if (massiv2.length > check) {
            System.out.println("Если длина массива ,больше 5, то заполняем суммой чисел массива");
            int sum = 0;
            for (int i = 0; i < massiv2.length; i++) {
                massiv2[i] = new Random().nextInt(20);
                sum += massiv2[i];
            }
            System.out.println(Arrays.toString(massiv2));
            System.out.println("Сумма элементов массива = " + sum);
        }

        if (massiv3.length < check) {
            System.out.println("Если длинна массива меньше 5, то заполнить массив чётными числами из рандома");
            for (int i = 0; i < massiv3.length; i++) {
                massiv3[i] = new Random().nextInt(50);
                if (massiv3[i] % 2 > 0) {
                    massiv3[i] = massiv3[i] + 1;
                }
            }
            System.out.println(Arrays.toString(massiv3));
        }
    }

    public static void main(String[] args) {
        int[] array1 = new int[5];
        int[] array2 = new int[10];
        int[] array3 = new int[4];
        getArray(array1, array2, array3);
    }
}

