import java.util.Scanner;
public class average {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("do you want calculated the average");
        System.out.println("enter 1:(yes)");
        System.out.println("enter 2:(exit)");
        while(true){
            System.out.println("enter option:");
            int op=input.nextInt();
            if(op==1){
                double sum=0;
                int count =0;
                int i=1;


                while(true){
                    System.out.println("enter"+ i +" th number(enter -1 to finish)");
                    double num=input.nextDouble();

                    if(num==-1)
                        break;
                    sum+=num;
                    count++;
                }
                if(count==0){
                    System.out.println("no entered number!");
                }
                else{
                    double average=sum/count;
                    System.out.println("the average is: ",average);
                }
            }
            else {
                System.out.println("terminate");
            }
        }}}

