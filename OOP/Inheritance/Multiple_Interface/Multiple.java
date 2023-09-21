package OOP.Inheritance.Multiple_Interface;

//base interface1
interface Runnable {
    public void run();
}

// base interface2
interface Speakable {
    public void speak();
}

// child interface inheriting 2 base interfaces
interface Ability extends Runnable, Speakable {
    public void show();
}

class Person implements Ability {
    @Override
    public void run() {
        System.out.println("I can Run");
    }

    @Override
    public void speak() {
        System.out.println("I can speak");
    }

    @Override
    public void show() {
        System.out.println("I am a Person, I can speak and Run");
    }

}

class Multiple {
    public static void main(String[] args) {
        Person p = new Person();

        p.run();
        p.speak();
        p.show();
    }
}
