package Lesson10;

public class Car {
    String color;
    String engine;
    int carDoors;

    Car(String color, String engine, int carDoors) {
        this.color = color;
        this.engine = engine;
        this.carDoors = carDoors;
    }
}

class CarTest {
    static void changeCarDoors(Car object, int newDoors) {
        object.carDoors = newDoors;
    }

    static void swapCarColors(Car obj1, Car obj2) {
        String bufferColor = obj1.color;
        obj1.color = obj2.color;
        obj2.color = bufferColor;
    }


    public static void main(String[] args) {
        Car myNewCar = new Car("black", "v4", 4);
        Car myNewCar2 = new Car("yellow", "v4turbo", 5);
        System.out.println("Color is my first car " + myNewCar.color);
        System.out.println("Color is my second car " + myNewCar2.color);
        changeCarDoors(myNewCar, 12);
        swapCarColors(myNewCar, myNewCar2);
        System.out.println("Color is my first car " + myNewCar.color + " and new doors is " + myNewCar.carDoors);
        System.out.println("Color is my second car " + myNewCar2.color);
    }
}
