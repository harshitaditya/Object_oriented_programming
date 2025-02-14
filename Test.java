class Student {
    protected String name;

    public void name_info(String name) {
        this.name = name;
    }
}

class Display extends Student {
    // constructor
    public Display(String name) {
        // name_info(name);
        this.name = name;
    }

    public void displayDetails() {
        // accessing protected data members of the superclass
        System.out.println("Name: " + name);
    }
}

public class Test {
    public static void main(String args[]) {
        Display obj = new Display("Aditya");
        obj.displayDetails();

    }

}
