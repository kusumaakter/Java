import java.util.Scanner;

public class averagee{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Do you want to calculate the average?");
        System.out.println("Enter 1 for Yes");
        System.out.println("Enter 2 for Exit");

        while (true) {
            System.out.print("Enter option: ");
            int op = input.nextInt();
            if (op == 1) {
                double sum = 0;
                int count = 0;
                int i = 1;

                while (true) {
                    System.out.print("Enter " + i + "th number (enter -1 to finish): ");
                    double num = input.nextDouble();

                    if (num == -1)
                        break;
                    sum += num;
                    count++;
                    i++;
                }
                if (count == 0) {
                    System.out.println("No numbers were entered!");
                } else {
                    double average = sum / count;
                    System.out.println("The average is: " + average);
                }
            } else if (op == 2) {
                System.out.println("Terminate");
                break;
            } else {
                System.out.println("Invalid option, please try again.");
            }
        }
        input.close();
    }
}
