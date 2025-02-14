class Shape {
    double pi = 3.14;
    double r;

}

class Circle extends Shape {
    double ans;

    public Circle(double r) {
        this.r = r;
    }

    public double area() {
        ans = pi * r * r;
        return ans;

    }

    public void result() {
        System.out.println("The area of circle is: " + area());

    }

}

class Semicircle extends Circle {
    double ans;

    public Semicircle(double r) {
        super(r);
    }

    public double area() {
        double ans = 0.5 * super.area();
        return ans;

    }

    public void result() {
        System.out.println("The area of Semicircle " + area());
    }
}

public class multilevel_inheitance {
    public static void main(String args[]) {
        Circle c1 = new Circle(2);
        c1.result();
        Semicircle sc1 = new Semicircle(2);
        sc1.result();

    }

}

// Note

// This is code of multilevel inheritance where we derive class from derived
// class.
