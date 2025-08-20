import java.util.Scanner;

public class test3 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in); // Corrected typo here
        
        System.out.print("Enter the radius: ");
        float r = scanner.nextFloat(); 
        float area = (float) (Math.PI * r * r); 
        System.out.println("Area: " + area);
        
        scanner.close();
    }
}
