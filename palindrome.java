import java.util.Scanner;

public class palindrome {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        String input;
        while(true)
        System.out.println("enter string:");
            input=scanner.nextLine();
            if(input.equalsIgnoreCase("exit")){
                System.out.println("existing program");
                break;
            }
        boolean ispalindrome = true;
        int length=input.length();
            for(int i=0;i<input.length()/2;i++){
                if(input.charAt(i)!=input.charAt(input.length()-1-i)){
                    ispalindrome=false;
                    break;
                }
            }
            if(ispalindrome){
                System.out.println("the entered string is palindrome");
            }
            else
            {
                System.out.println("not palindrome");
            }
            scanner.close();
        }
    }
    

