//Loops: a) For loop , b) ForEach loop, c) while loop, d) do-while loop

import java.util.Scanner;

public class LoopsProgram {

    public static void main(String[] args) {

//        int i=1;

//        for(int i=1;i<=num;i++){
//            if(i%2==0){
//                System.out.println(i);
//            }
//        }

        //while loop
//        while(i<=num){
//            if(i%2==0){
//                System.out.println(i);
//            }
//            i++;
//        }

        //do-while

        int total=0;int num;
        Scanner sc=new Scanner(System.in);
        do{
            System.out.println("Enter number: ");
            num=sc.nextInt();
            total=total+num;
        }while(num!=0);

        System.out.println("Total is: "+total);
    }
}
