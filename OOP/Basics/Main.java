
class Main {

    String color;
    int age;

    public void eat() {
        System.out.println("I am eating");
    }

    Main(String color, int age) {
        this.color = color;
        this.age = age;
    }

    public void animalInfo() {
        System.out.println("color is " + color);
        System.out.println("Age is " + age);
    }

    public static void main(String args[]) {
        System.out.println("Hello");
        Main m = new Main("Red", 6);
        // m.color = "Brown";
        // m.age = 5;
        m.eat();
        m.animalInfo();
        Birds b = new Birds();
        b.fly();
    }
}

class Birds {
    void fly() {
        System.out.println("I can fly");
    }
}