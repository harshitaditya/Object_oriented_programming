class Animal {
    public void eat() {
        System.out.println("Animal can eat.");
    }
}

class Dog extends Animal {
    public void bark() {
        super.eat(); // Super keyword refer the immediate parent class object.
        System.out.println("Dog can bark");
    }
}

public class singlelevel_inheritance {
    public static void main(String args[]) {
        Dog d1 = new Dog();
        d1.bark();

    }

}

// Notes
// 1. Inheritance is powerful features in oops, which is defined as the process
// where one class acquire the properties of parent class.

// 2. Reuseability of code increase using inheritance.

// 3. There is two class first is Super class and second is subclass.

// 4. Superclass is a class where properties are inherited to subclass.

// 5. Super keyword is a refernce variable which is used to refer to the
// immediate parent class object.

// 6. To inherit properties of superclass we use extend keyword.
