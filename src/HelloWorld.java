import java.util.Scanner;

//Variables: a) Instance variables, b) local variables, c) class/static variables, d) parameters
// Data Types: 2 main types: a) Primitive, b) Non-primitive
// a) Primitive: 1) int, 2) double, 3) float, 4) short, 5) byte, 6) boolean, 7) char, 8) long
public class HelloWorld {

    int x=40;  //instance variable
    static int p=70; //class or static variable
    static int q=80;
    public static void main(String[] args) {
        int a;  //local variable
        int b;

        boolean flag=true;
        long c=12367865435l;
        System.out.println(c);
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of a: ");
        a=sc.nextInt();
        System.out.println("Enter value for b: ");
        b=sc.nextInt();
        int total=a+b;
        System.out.println("total is: "+total);

        HelloWorld h=new HelloWorld();
        int total1=h.x+h.y;
        System.out.println("New total of x and y is: "+total1);

        int total2=HelloWorld.p+HelloWorld.q;
    }
    int y=50;  //instance variable
}
