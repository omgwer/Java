package Lesson5;

public class ReturnSumm {
    int sum(int a, int b, int c) {
        int result = a + b + c;
        return result;
    }

    int averageNumbers(int a1, int b1, int c1) {
        int averageResult = sum(a1, b1, c1) / 3;
        return averageResult;
    }
}

class Summ {
    public static void main(String[] args) {
        ReturnSumm t = new ReturnSumm();
        int finishResult = t.sum(25, 44, 2);
        System.out.println(finishResult);

        System.out.println(t.averageNumbers(25, 41, 65));
    }
}