package Lesson8;

public class Hw {
    static int multiplicator(int ch1, int ch2, int ch3) {
        return  ch1 * ch2 * ch3;
    }

    static void subtraction(int ch1, int ch2) {
        System.out.println("Celoe ot delenya = " + ch1 / ch2);
        System.out.println("Ostatok ot delenya = " + ch1 % ch2);
    }

    static int ch1, ch2, ch3;

}

class calculator {
    public static void main(String[] args) {
        System.out.println(Hw.multiplicator(5,34,2));
        Hw.subtraction(15,2);
    }
}
