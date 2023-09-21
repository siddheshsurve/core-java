
class Test {

    int i;
    String s;

    // Test() {
    // i = 1;
    // s = "Your Name";
    // }

    Test(int n, String name) {
        i = n;
        s = name;
    }

    public static void main(String[] args) {
        Test t1 = new Test(80, "Siddhesh");
        Test t2 = new Test(100, "Sarvesh");
        System.out.println(t1.i + " " + t1.s);
        System.out.println(t2.i + " " + t2.s);
    }
}
