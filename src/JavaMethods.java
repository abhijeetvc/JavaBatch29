//Method : Methods are nothing but small block of code
// Methods has: a) access modifier, b) return type, c) method name, d) body, e) return statement, f) parameters
// Access Modifier: 4 types: 1) public, 2) default, 3) protected, 4) private  // used for restrictions based on scope

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

        int result=j.add(10,20);
        System.out.println(result);
    }
}
