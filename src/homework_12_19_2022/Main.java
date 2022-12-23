package homework_12_19_2022;

import java.io.FilterOutputStream;
import java.util.Arrays;

//Написать метод который проходится по массиву Int[] умножает каждое четное число на 3 а не четное на 5,
//далее надо отфильтровать  числа которые больше 25 и посчитать их сумму и вывести на экран.
public class Main {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};

        array = Arrays.stream(array)
                .map(element -> {
                    if (element % 2 == 0) {
                        element = element * 3;
                    } else {
                        if (element % 2 == 1) {
                            element = element * 5;
                        }
                    }
                    return element;
                }).toArray();
        System.out.println("Чётное число в массиве умножается на 3, а не чётное на 5 = " + Arrays.toString(array));

        int chain = Arrays.stream(array)
                .filter(element -> element > 25)
                .reduce((element1, element2) -> element1 + element2)
                .getAsInt();
        System.out.println("Сумма чисел из массива, которые больше 25 = " + chain);

    }
}
