import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
        int a,i=0,count;
       // boolean flag=false;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter range: ");
        int range=sc.nextInt();
        for(a=2;a<=range;a++){
            count=0;
        for(i=1;i<=a;i++){
            if(a%i==0){
                count++;
            }
        }
        if(count==2){
            System.out.println(a+" ");
        }
        }

    }
}
