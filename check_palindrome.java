import java.util.Scanner;

public class  check_palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;

        while (true) {
            System.out.println("Enter a string (type 'exit' to quit):");
            input = scanner.nextLine();
            
            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Exiting program.");
                break;
            }

            boolean isPalindrome = true;
            int length = input.length();

            for (int i = 0; i < length / 2; i++) {
                if (input.charAt(i) != input.charAt(length - 1 - i)) {
                    isPalindrome = false;
                    break;
                }
            }

            if (isPalindrome) {
                System.out.println("The entered string is a palindrome.");
            } else {
                System.out.println("The entered string is not a palindrome.");
            }
        }

        scanner.close();
    }
}

