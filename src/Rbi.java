//Interface: It is a special type of class.
// You can achieve 100% abstraction using interfaces

public interface Rbi {
    void withdraw();
    void deposit();
}
class Sbi implements Rbi{

    @Override
    public void withdraw() {
        System.out.println("in withdraw method");
    }

    @Override
    public void deposit() {
        System.out.println("In deposit method");
    }

    public void display(){
        System.out.println("In display");
    }
}

class Icici implements Rbi{

    @Override
    public void withdraw() {
        System.out.println("In withdraw of Icici");
    }

    @Override
    public void deposit() {
        System.out.println("In deposit of Icici");
    }

    void display1(){
        System.out.println("In display1 of Icici");
    }
}

class MainCheck{
    public static void main(String[] args) {
        Rbi r1=new Sbi();
        r1.withdraw();
        r1.deposit();

        Rbi r2=new Icici();
        r2.withdraw();
        r2.deposit();

    }
}