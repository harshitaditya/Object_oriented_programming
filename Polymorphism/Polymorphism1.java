
class MultiplyFun {
    // Method with 2 parameter
    static int Multiply(int a, int b) {
        return a * b;
    }

    // Method with the same name but 3 parameter
    static int Multiply(int a, int b, int c) {
        return a * b * c;
    }
}

public class Polymorphism1 {
    public static void main(String args[]) {
        MultiplyFun obj = new MultiplyFun();
        System.out.println(obj.Multiply(2, 3));

    }

}
