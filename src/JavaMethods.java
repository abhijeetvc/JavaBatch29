//Method : Methods are nothing but small block of code
// Methods has: a) access modifier, b) return type, c) method name, d) body, e) return statement, f) parameters
// Access Modifier: 4 types: 1) public, 2) default, 3) protected, 4) private  // used for restrictions based on scope

import java.util.Scanner;

public class JavaMethods {

    public void display(){
        System.out.println("In display method");
    }

    public int add(int a,int b){
        int c=a+b;
        return c;
    }

    public static void main(String[] args) {

        JavaMethods j=new JavaMethods();
        j.display();

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value for a: ");
        int a=sc.nextInt();
        System.out.println("Enter value for b: ");
        int b=sc.nextInt();

        int result=j.add(a,b);
        System.out.println(result);
    }
}
