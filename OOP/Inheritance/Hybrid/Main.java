package OOP.Inheritance.Hybrid;

// Creating interfaces
interface CompetitiveCoder {
    void competitive();
}

interface NormalCoder {
    void normal();
}

// Creating a Parent Class with a method greeting()
class Programmer {
    void greeting() {
        System.out.println("Hello Programmer!!");
    }
}

// First child class
class Programmer1 extends Programmer implements NormalCoder {
    public void normal() {
        System.out.println("Hey, Programmer1 you can start with the normal coding.");
    }
}

// Second child class
class Programmer2 extends Programmer implements NormalCoder, CompetitiveCoder {
    public void normal() {
        System.out.println("Hey, Programmer2 first you should start with normal coding.");
    }

    public void competitive() {
        System.out.println("Hey, Programmer2 now you can start with competitive programming.");
    }
}

class Main {
    public static void main(String[] args) {
        // Calling methods for Ninja1
        Programmer1 p1 = new Programmer1();
        p1.greeting();
        p1.normal();

        System.out.println();

        // Calling methods for Ninja2
        Programmer2 p2 = new Programmer2();
        p2.greeting();
        p2.normal();
        p2.competitive();
    }
}