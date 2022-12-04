package homework_10_16_2022;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        String[] array = new String[22];
        int[] array1 = {5, 10, 3, 2, 1, 9};
        char[] array2 = new char[5];
        testFori(array);
        testForeach(array1);
        testForiIf(array1);
        testWhile(array1);
        testChar(array2);
    }
    private static void testFori(String[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = String.valueOf(new Random().nextInt(10));
        }
        System.out.println("[For] Рандомные числа из массива = " + Arrays.toString(array));
    }
    private static void testForeach(int[] array1) {
        int sum = 0; // суммарное количество оценок
        for (int grade : array1) {
            sum += grade;
        }
        System.out.println("[Foreach] Среднея оценка по массива = " + (sum / array1.length));
    }
    private static void testForiIf(int[] array1){
        int maxGrade = array1 [0];
        for (int num : array1){
            if (num > maxGrade){
                maxGrade = num;
            }
        }
        System.out.println("[ForiIf] Лучшая (максимальная) оценка массива = " + maxGrade);
    }
    private static void testWhile(int[] array1){
        int sum = 0; // суммарное количество оценок
        int i = 0;
        while (i < array1.length) {
            int grade = array1[i];
            sum += grade;
            i++;
        }
        System.out.println("[While] Среднея оценка по массиву = " + (sum / array1.length));
    }
    private static void testChar(char[] array2) {
        for (char i = 0; i < array2.length; i++) {
            array2[i] = (char) new Random().nextInt(10);
        }
        System.out.println("[Char] Рандомные символы из массива char = " + Arrays.toString(array2));
    }
}


