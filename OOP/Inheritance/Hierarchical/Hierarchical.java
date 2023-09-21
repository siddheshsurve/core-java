package OOP.Inheritance.Hierarchical;

class Person {
    public void show() {
        System.out.println("I am a Person");
    }
}

class Student extends Person {
    public void show1() {
        System.out.println("I am Student who is Person");
    }
}

class Teacher extends Person {
    public void show2() {
        System.out.println("I am Teacher who is Person");
    }
}

class Hierarchical {
    public static void main(String[] args) {
        Person p = new Person();
        Student s = new Student();
        Teacher t = new Teacher();

        t.show();
        t.show2();
        s.show();
        s.show1();
    }
}
