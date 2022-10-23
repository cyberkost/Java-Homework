package homework26_09_2022;

public class Main {

    static int getSum(int a, int b) {
        return a + b;
    }

    static double getMinus(double e, double d) {
        return e - d;
    }

    static void getMultiply(float f, float g) {
        float multiply = f * g;
        System.out.println(multiply);
    }

    static void getDivide(long l, long o, long i) {
        float divide = l / o + i;
        System.out.println(divide);
    }

    public static void main(String[] args) {
        System.out.println(getSum(33, 12));
        System.out.println(getMinus(10.5,5.0 ));
        getMultiply(10, 6);
        getDivide(100,10, 9);
    }
}


class Main2 {
    public static void main(String[] args) {
        Main second1 = new Main();
        second1.getMultiply(200, 3);
        System.out.println(second1);
    }

}

