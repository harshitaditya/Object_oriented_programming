package Packages;

public class Student {
    public static void main(String arg[]) {
        Student_info obj1 = new Student_info();
        obj1.setname("Aditya Kumar");
        obj1.setage(22);
        obj1.setcourse("Btech");
        System.out.println("Name " + obj1.getname() + "Age: " + obj1.getage() + "Course " + obj1.getcourse());

    }

}
