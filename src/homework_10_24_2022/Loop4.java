package homework_10_24_2022;

import java.util.Arrays;
import java.util.Random;

// Заполнить массив с конца до начала, а потом заполнить по нормальному, теми же числами
public class Loop4 {
    public static void arrRes (int[] array){
        int[] order = new int[array.length];
        int[] reverse = new int[array.length];
        for (int i = order.length - 1; i > - 1; i--) {
            order[i] = new Random().nextInt(80);
        }
        System.out.println(Arrays.toString(order));
        for (int i = 0; i < reverse.length; i++) {
            reverse[i] = order[order.length - (i + 1)];
        }
        System.out.println(Arrays.toString(reverse));
    }

    public static void main(String[] args) {
        int[] array2 = new int[new Random().nextInt(50)];
        arrRes(array2);
    }
}
