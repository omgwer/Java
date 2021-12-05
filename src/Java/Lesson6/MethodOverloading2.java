package Lesson6;

public class MethodOverloading2 {

    int sum(int i1, int i2) {
        return i1 + i2;
    }

    String sum(String s1, String s2) {
        return s1 + s2;
    }
}

class MethodOverloading2Test {
    public static void main(String[] args) {
        MethodOverloading2 mO2 = new MethodOverloading2();

        int intRes = mO2.sum(2, 6);
        System.out.println(intRes);
        String strRes = mO2.sum("Hello,", " Dolly");
        System.out.println(strRes);
    }
}


