class A {
    void show() {
        System.out.println("A Class here");
    }
}

public class Main extends A {
    void show() {
        super.show();
        System.out.println("Main Class here");
    }

    public static void main(String[] args) {
        A a = new A();
        Main m = new Main();
        // a.show();
        m.show();
    }
}

// final methods cannot override

// static methods cannot override

// private methods cannot override

// synchronized or strictfp can be override
