class Human {
    String name;
    int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;

    }

    public void getname() {
        System.out.println("The name of human is " + name);
        System.out.println("The age of human is " + age);
    }

    public void eating() {
        System.out.println("Human needs food to eat.");
    }

    public void sleep() {
        System.out.println("Human sleeps at night.");
    }

    public void walk() {
        System.out.println("Human walk on two legs.");
    }

}

class Men extends Human {

    String beardstyle;

    public Men(String name, int age, String beardstyle) {
        super(name, age); // Super constructor which refer to the immediate parent class object.
        this.beardstyle = beardstyle;
    }

    public void beard() {
        System.out.println(name + " has " + beardstyle + " beard.");
    }

}

class Women extends Human {
    String hairstyle;

    public Women(String name, int age, String hairstyle) {
        super(name, age);
        this.hairstyle = hairstyle;
    }

    public void hairstyle() {
        System.out.println(name + " has beautiful " + hairstyle + " hair.");
    }

}

public class hierarchical_inheritance {
    public static void main(String args[]) {
        Men men1 = new Men("Aditya", 21, "short");
        men1.getname();
        men1.beard();
        men1.eating();
        Women women1 = new Women("Riya", 21, "long");
        women1.getname();
        women1.hairstyle();

    }

}

// Notes

// 1. This is Hierarchical inheritance where multiple child classes inherit from
// a single parent class.
// 2. here we use super constructor which refer to the immediate parent class
// object.
