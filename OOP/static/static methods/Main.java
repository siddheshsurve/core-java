
class A {
    static void display() {
        System.out.println("Method from A");
    }
}

public class Main {
    static void show() {
        System.out.println("Method f rom main class");
    }

    public static void main(String[] args) {
        // Main m = new Main();
        // m.show();
        Main.show();
        // or simply show();
        A.display();
    }
}
