class Car {
    String name;
    int launch_year;
    String engine;
    int topspeed;

    // public Car(String carname, int carlaunch_year, String carengine, int
    // cartopspeed) {// here we create a constructor
    // name = carname;
    // launch_year = carlaunch_year;
    // engine = carengine;
    // topspeed = cartopspeed;
    // }

    // using "this" keyword
    public Car(String name, int launch_year, String engine, int topspeed) {// here we create a constructor
        this.name = name;
        this.launch_year = launch_year;
        this.engine = engine;
        this.topspeed = topspeed;
    }
}

public class object_and_class {
    public static void main(String args[]) {
        Car car1 = new Car("Alto", 2002, "Petrol", 180);
        Car car2 = new Car("Swift", 2010, "Diesel", 210);
        System.out.println(car1.name);
        System.out.println(car2.name);
        car2.name = "Baleno";
        System.out.println(car2.name);

    }

}

// Notes
// 1. Class is a blueprint that define variable and Method which is common to
// all the Object.

// 2. Class is intialize by "class" keyword and name of intial letter of class
// should be Capital.

// 3. Object is a single entity that have their own state and behaviour, in
// above code state is name,engine etc.. and behaviour means Method.

// 4. In java except primitive data type all the other things are Object, Array
// is also a object.

// 5. In above code we also we use Constructor, is used for craeting a new
// object from the class and assign the value of class member or instance
// variable when the object is created.

// 6. This keyword refers the current instance or object of the class and used
// to access the variable that belong to class.

// 7. We can dynamically change the value of object, It means object are
// mutable.