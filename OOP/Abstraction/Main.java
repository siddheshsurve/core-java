
abstract class Vehicle {
    abstract void start();
}

class Car extends Vehicle {
    void start() {
        System.out.println("Car starts with key");
    }
}

class Scooter extends Vehicle {
    void start() {
        System.out.println("Scooter starts with kick");
    }
}

class Main {
    public static void main(String[] args) {
        Car c = new Car();
        Scooter s = new Scooter();

        s.start();
        c.start();
    }
}
