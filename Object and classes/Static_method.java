class Car {
    static int a = 5;
    static int b;

    static void print() {
        System.out.println("this is instance class");
        b = a * 10;
    }
}

public class Static_method {
    public static void main(String args[]) {
        Car.print();
        System.out.println(Car.a + Car.b);

    }

}
// Notes
// Static method evoked without creating a object.

// Static method belongs from class not from class.

// Static method can only access Static variable.
