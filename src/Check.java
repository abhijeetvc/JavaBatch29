// Abstract class: It is an incomplete class
// We cannot create object of abstract class
// Abstract class can have concrete methods
// Some or 100% percent of abstraction can be achieved


abstract class DemoTest{
    abstract void display();
}

public class Check extends DemoTest{

    public static void main(String[] args) {
        Check a=new Check();
        a.display();
    }

    @Override
    void display() {
        System.out.println("In display");
    }
}
