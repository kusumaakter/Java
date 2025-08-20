import java.util.Scanner;
public class circle{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        while(true){
        System.out.println("do you calculated circle area?");
        System.out.println("enter 1:(yes)");
        System.out.println("enter 2:(NO)");
        System.out.println("enter option: ");
        int op=input.nextInt();
        if(op==1){
            System.out.println("enter radius:");
            float r=input.nextFloat();
            double area =Math.PI*r*r;
            System.out.println("area "+ area);
            System.out.flush();
        }
        else{
            System.out.println("TERminate");
        }

    }
}}
