package Homework10_10_2022;

public class ArrayEx {
    public static void main(String[] args) {
        int[] array = new int[2];
        int[] array1 = {23, 56, 77};
        String[] array2 = new String[5];
        String[] array3 = {"Cat", "Dog", "Snake"};
        float[] array4 = new float[8];
        float[] array5 = {4, 43, 100, 91};

        for (int f: array1) {
            System.out.println(f);
        }

        int[] years = {42, 27, 35, 29, 51};
        double sum = 0;
        for (int year: years) {
            sum += year;
        }
        System.out.println("Среднее арифмитическое возраста = " + (sum / years.length));



    }

}
