
public class Main {
    void show() {
        System.out.println("1");
    }

    void show(int a) {
        System.out.println("2");
    }
 

    public static void main(String[] args) {
        Main m = new Main();
        m.show(10);
    }
}
