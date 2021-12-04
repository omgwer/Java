package Lesson8;

public class Test1 {
    public static final double PI = 3.14;
}

class circleInfo {
    double areOfACircle(double radius) {
        double result = Test1.PI * radius * radius;
        return result;
    }

    static double lenghtCirlce(double radius) {
        double result = Test1.PI * radius * 2;
        return result;
    }

    void printResult(double radius) {
        circleInfo circleArea = new circleInfo();
        System.out.println("Area of a circle = " + circleArea.areOfACircle(radius));
        System.out.println("Lenght of a circle = " + lenghtCirlce(radius));
        System.out.println("Radius = " + radius);
    }

    public static void main(String[] args) {
        circleInfo pr = new circleInfo();
        pr.printResult(10);
    }
}
