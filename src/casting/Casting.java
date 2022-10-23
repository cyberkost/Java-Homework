package casting;

public class Casting {

    public static void main(String[] args) {

        double d = 4.5;
        int i = (int) d;

        byte a = 2;
        int b = (int) a;

        int y = 33;
        char n = (char) y;

        int i2 = 95;
        byte b2 = (byte) i2;

        long l = 200;
        short zz = (short) l;

        char ch = 'A';
        int is = ch;

        long lon = 333;
        byte bbb = (byte) lon;

        float fl = 1.2f;
        double dou = fl;

        double dob = 1.2d;
        float flf = (float) dob;

        char c = 'h';
        String str = "Hello";

        System.out.println(i);
        System.out.println(b);
        System.out.println(n);
        System.out.println(i2);
        System.out.println(zz);
        System.out.println(is);
        System.out.println(bbb);
        System.out.println(dou);
        System.out.println(flf);
        System.out.println(dou);
    }
}