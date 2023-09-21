class A {
    int a = 10;
}

public class Main extends A {
    int a = 20;

    void show(int a) {
        System.out.println(a); // 30
        // this.a //20
        // super.a //10
    }

    public static void main(String[] args) {
        Main m = new Main();
        m.show(30);
    }
}
