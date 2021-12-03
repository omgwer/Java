package Lesson5;

public class Car {
    Car(String cvet, String motor) {
        color = cvet;
        engine = motor;
    }

    Car() {
        System.out.println("Obj is created!");
    }

    String color;
    String engine;
    int speed;

    int gaz(int skorost) {
        speed += skorost;
        return speed;
    }

    int tormoz(int skorost) {
        speed -= skorost;
        return speed;
    }

    void showInfo() {
        System.out.println("Your auto color: " + color + ". Your auto engine: " + engine + ". Your auto speed: " + speed + " Km/h.");
    }
}

class CatTest {
    public static void main(String[] args) {
        Car Car1 = new Car("red", "v12");
        Car Car2 = new Car();
        System.out.println(Car1.engine);
    }
}