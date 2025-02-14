import Packages.Student_info;

public class Demo_package {
    public static void main(String arg[]) {
        Student_info obj1 = new Student_info();
        obj1.setname("Aditya Kumar");
        obj1.setage(22);
        obj1.setcourse("Btech");
        System.out.println("Name " + obj1.getname() + "Age: " + obj1.getage() + "Course " + obj1.getcourse());

    }

}

// Notes
// Packages are group of similar type classes, Interface and subclasses.
// Package Name Description
// java.lang =>Core classes (String, Math, Object, System, etc.)
// java.util =>Utility classes (Collections, Scanner, Date, etc.)
// java.io =>Input/Output classes (File handling, Streams, etc.)
// java.net => Networking classes (Socket, URL, etc.)
// java.sql =>Database connectivity (JDBC)
// javax.swing =>GUI components (JFrame, JButton, etc.)