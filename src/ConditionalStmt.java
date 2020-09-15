import java.util.Scanner;

public class ConditionalStmt{

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter number1 : ");
        int num1=sc.nextInt();

        System.out.println("Enter number2 : ");
        int num2=sc.nextInt();

        System.out.println("Enter choice: ");
        int choice=sc.nextInt();

        int result=2;
        switch(choice){
            case 1:
                result=num1+num2;
                System.out.println("Addition is: "+result);
                break;

            case 2:
                result=num1-num2;
                System.out.println("Subtraction is: "+result);
                break;

            case 3:
                result=num1*num2;
                System.out.println("Multiplication is: "+result);
                break;

            case 4:
                result=num1/num2;
                System.out.println("Division is: "+result);
                break;

            default:
                System.out.println("Incorrect choice");
                break;
        }
    }
}
