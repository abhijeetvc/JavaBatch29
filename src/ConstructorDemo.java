//Constructor: Special type of method


import java.util.Scanner;

public class ConstructorDemo {

    int a,b;  //instance variable
    public ConstructorDemo(int a,int b) {
        this.a=a;  //this is keyword in java. It is used to refer to current object
        this.b=b;
    }
    public void addNumbers(){
        int result=a+b;
        System.out.println("In add number method : "+result);
    }

    public void multiply(){
        addNumbers();
        int result=a*b;
        System.out.println("Mukltiplication: "+result);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value for a: ");
        int a=sc.nextInt();
        System.out.println("Enter value for b: ");
        int b=sc.nextInt();
        ConstructorDemo c=new ConstructorDemo(a,b);
        c.addNumbers();
        c.multiply();
    }
}
