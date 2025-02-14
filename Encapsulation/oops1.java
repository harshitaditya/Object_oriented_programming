class Student {
    private String name;
    private String course;
    private int age;

    public void setname(String name) {
        this.name = name;

    }

    public String getname() {
        return name;
    }

    public void setage(int age) {
        this.age = age;
    }

    public int getage() {
        return age;
    }

    public void setcourse(String course) {
        this.course = course;
    }

    public String getcourse() {
        return course;
    }

}

public class oops1 {
    public static void main(String args[]) {
        Student s1 = new Student();
        s1.setname("Aditya Kumar");
        s1.setage(21);
        s1.setcourse("btech");
        System.out.println(s1.getname() + "," + s1.getcourse() + "," + s1.getage());

    }

}

// Notes
// 1. Enacpsulation is a defined as wrapping up tha data into single unit, so
// that no cone access the class member outside the class.

// 2. Technically, data member is protected or hidden from other class it is
// only accessed by methods of class.

// 3. Encapsulation can be achieved by declaring the data member or variable of
// class as private and methods are private.

// 4. In encapsulation the value is assign to object using setter and getter
// method.
