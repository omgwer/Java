package Lesson2;

public class PrimitiveDataTypes
{
    public static void main(String [] args)
    {
        byte b1 = 127;
        short s1 = -10000;
        int i1 = -1231234;
        long L1 = -12312412312L;
        float f1 = 4.234F;
        double d1 = 5.5;
        char ch1 = ' ';
        char ch2 = 'e';  // 10
        char ch3 = '\u05F0';  // 16

        int a1 = 60;       // 10
        int a2 = 0B111100; // 2   0B - before
        int a3 = 074;      // 8   0  - before
        int a4 = 0x3c;     // 16  0x - before

        int a5 = 1_000_000; // underscore

        System.out.println(a3);
    }
}
