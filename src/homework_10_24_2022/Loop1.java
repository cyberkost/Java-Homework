package homework_10_24_2022;

import java.util.Arrays;
import java.util.Random;

public class Loop1 {
    public static void getArray(int[] array1) {
        Random random = new Random();
        int check = 3;
        int[] massiv1 = new int[array1.length];

        if (massiv1.length == check) {
            System.out.println("Если длина массива равна 3, то заполняем рандомными числами");
            for (int i = 0; i < massiv1.length; i++) {
                massiv1[i] = new Random().nextInt(50);
            }
            System.out.println(Arrays.toString(massiv1));
        }

        if (massiv1.length > check) {
            System.out.println("Если длина массива ,больше 3, то заполняем суммой чисел массива");
            for (int i = 0; i < check; i++) {
                massiv1[i] = random.nextInt(50);
            }
            for (int i = check; i < massiv1.length; i++) {
                massiv1[i] = massiv1[i - 1] + massiv1[i - 2] + massiv1[i - 3];
            }
            System.out.println(Arrays.toString(massiv1));
        }

        if (massiv1.length < check) {
            System.out.println("Если длинна массива меньше 3, то заполнить массив чётными числами из рандома");
            for (int i = 0; i < massiv1.length; i++) {
                massiv1[i] = new Random().nextInt(50);
                if (massiv1[i] % 2 > 0) {
                    massiv1[i] = massiv1[i] + 1;
                }
            }
            System.out.println(Arrays.toString(massiv1));
        }
    }

    public static void main(String[] args) {
        int[] array1 = new int[new Random().nextInt(5)];
        getArray(array1);
    }
}


