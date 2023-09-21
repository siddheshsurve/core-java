class A {
    int id;

    void setId(int id) {
        this.id = id;
    }

    void show() {
        System.out.println("Your id is " + id);
    }
}

class Main {
    public static void main(String[] args) {
        A a = new A();
        a.setId(10);
        a.show();
    }
}
