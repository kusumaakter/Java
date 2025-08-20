import java.util.Random;

public class smlrar {
    public static void main(String[] args) {
        int[] numbers = generateRandomArray(10); // Change 10 to the desired size of your array

        // Print the generated array
        System.out.println("Generated Array:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Find the largest and smallest numbers
        int largest = numbers[0];
        int smallest = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
            if (numbers[i] < smallest) {
                smallest = numbers[i];
            }
        }

        // Print the largest and smallest numbers
        System.out.println("Largest number: " + largest);
        System.out.println("Smallest number: " + smallest);
    }

    // Method to generate an array of random numbers
    public static int[] generateRandomArray(int size) {
        Random random = new Random();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(100); // Generates random numbers between 0 and 99
        }
        return array;
    }
}
