class Car {
    String name;
    static String engine;

    public Car(String name) {
        this.name = name;
    }

    public void print() {
        System.out.println("Name: " + name + " " + " engine: " + engine);
    }

}

public class static_keyword {
    public static void main(String args[]) {
        Car.engine = "Petrol";
        Car car1 = new Car("Swift");
        car1.print();
        // car1.engine = "Diesel";// This line show error because here we access the
        // static variable using object which is not recommended in java.
        // car1.print();

    }

}

// Notes
// 1. Static variable belongs to class not to object.

// 2. Static keyword get once memory in a class, So when a value is assign to
// the variable we then its same for all object.

// 3. It is mutable, We can change the value of variable using class name.

// 4. It is used for memory management, it is used when the state is common for
// all object like school name for all student of same school.
