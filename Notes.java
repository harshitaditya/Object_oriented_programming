abstract class Abc {
    abstract public void do_something();

}

class xyz extends Abc {
    public void do_something() {
        System.out.println("This is xyz class");
    }
}

public class Notes {
    public static void main(String args[]) {
        xyz obj = new xyz();
        obj.do_something();

    }
}
