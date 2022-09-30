import java.util.Scanner;

public class Main {
    static int getNum1(int a, int b) {
        return a + b;
    }

    static int getNum2(int a) {
        return a * 2;
    }

    public static void getNum3(int f, long g) {

        System.out.println(f / g);
    }

    static float getNum4(float f1, float f2, float f3) {

        return (f1 + f2) / f3;
    }

    public static void getNum5(short s1, short s2, short s3) {

        System.out.println((s1 / s2) * s3);
    }

    static int getNum6(int i1, int i2, int i3) {
        int result = i1 + i2 + i3;
        return result;
    }

    static void getNum7(int t, int z) {
        int result = t + z;
        System.out.println("The result is: " + result);
    }

    static double getNum8(double g) {
        return g % 5;
    }

    static int getNum9(int a, int s, int d) {
        int result = a * s * d;
        return result;
    }

    static double getNum10(double y1, double y2) {
        double result = y1 / y2;
        return result;
    }

    static double getNum11(double kk, double jj) {
        return kk * jj;
    }

    static double getNum12(double hh, double tt) {
        return hh + tt;
    }

    static long getNum13(long s1, long s2, long s3) {
        long result = s1 + s2 + s3;
        return result;
    }

    static long getNum14(long d1, long d2) {
        return d1 * d2;
    }

    static long getNum15(long h1, long h2) {
        return h1 * h2;
    }

    static long getNum16(long u1, long u2) {
        return u1 * u2;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(getNum1(scanner.nextInt(), scanner.nextInt()));

        System.out.println(getNum2(scanner.nextInt()));

        getNum3(scanner.nextInt(), scanner.nextLong());

        System.out.println(getNum4(scanner.nextFloat(),scanner.nextFloat(), scanner.nextFloat()));

        getNum5(scanner.nextShort(),scanner.nextShort(),scanner.nextShort());

        int i4 = scanner.nextInt();
        int i5 = scanner.nextInt();
        int i6 = scanner.nextInt();
        System.out.println(getNum6(i4, i5, i6));

        System.out.println("Please input first digit....");
        int t = scanner.nextInt();
        System.out.println("Please input second digit....");
        int z = scanner.nextInt();
        System.out.println("Your digits are: " + t + " and " + z);
        getNum7(t, z);

        System.out.println(getNum8(scanner.nextDouble()));

        int a = scanner.nextInt();
        int s = getNum6(1, 1, scanner.nextInt());
        int d = getNum2(scanner.nextInt());
        System.out.println(getNum9(a, s, d));

        double y1 = getNum11(scanner.nextDouble(), scanner.nextDouble());
        double y2 = getNum12(scanner.nextDouble(), scanner.nextDouble());
        System.out.println(getNum10(y1, y2));

        System.out.println("Введите числа для первого метода....");
        long s1 = getNum14(scanner.nextLong(), scanner.nextLong());
        System.out.println("Введите числа для второго метода....");
        long s2 = getNum15(scanner.nextLong(), scanner.nextLong());
        System.out.println("Введите числа для третьего метода....");
        long s3 = getNum16(scanner.nextLong(), scanner.nextLong());
        System.out.println("Результат работы трёх методов....");
        System.out.println(getNum13(s1, s2, s3));


    }
}