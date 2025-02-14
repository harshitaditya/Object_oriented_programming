class Car {
    final int price = 500000;

}

public class final_keyword {
    public static void main(String args[]) {
        Car car1 = new Car();
        System.out.println(car1.price);
        // car1.price = 20000000; // show error

    }

}

// Notes
// If you use Final keyword with any data memeber of class you can
// not change the value of that variable again.
