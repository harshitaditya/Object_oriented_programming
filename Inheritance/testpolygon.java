import java.util.*;

class Polygon {
    int n;
    int sides[];

    public Polygon(int n) {
        this.n = n;
        this.sides = new int[n];
    }

    public void inputsides() {
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < this.n; i++) {
            System.out.println("Please Enter the " + (i + 1) + " side");
            this.sides[i] = s.nextInt();

        }
    }

    public void displayside() {
        for (int i = 0; i < this.n; i++) {
            System.out.println("The " + (i + 1) + " side is " + this.sides[i]);
        }
    }

}

class Triangle extends Polygon {
    public Triangle(int n) {
        super(n);

    }

    public void findarea() {

        int a = super.sides[0];
        int b = super.sides[1];
        int c = super.sides[2];
        int s = (a + b + c) / 2;
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        System.out.println("The area of triangle is: " + area);
    }

}

public class testpolygon {
    public static void main(String args[]) {
        Triangle t1 = new Triangle(3);
        t1.inputsides();
        t1.displayside();
        t1.findarea();
    }

}

// Notes

// 1.In Java, you cannot inherit a superclass constructor directly without using
// the super keyword, because Java does not support constructor inheritance
// automatically. However, there are alternative workarounds to achieve similar
// behavior, we can explicitily inherit the constructor from parent class.
