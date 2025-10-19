import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Step 1: Get the numbers from user
        System.out.println("=== TWO SUM FINDER ===");
        System.out.println("This program finds two numbers that add up to your target!\n");
        
        System.out.print("How many numbers do you have? ");
        int size = input.nextInt();
        
        // Create an array to store the numbers
        int[] numbers = new int[size];
        
        System.out.println("Enter " + size + " numbers:");
        for (int i = 0; i < size; i++) {
            System.out.print("Number " + (i+1) + ": ");
            numbers[i] = input.nextInt();
        }
        
        // Step 2: Get the target sum
        System.out.print("\nWhat is your target sum? ");
        int target = input.nextInt();
        
        // Step 3: Find two numbers that add up to target
        System.out.println("\n--- Searching for solution ---");
        boolean found = false;
        
        // Try every possible pair
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                
                // Show what we're checking
                System.out.println("Checking: " + numbers[i] + " + " + numbers[j] + " = " + (numbers[i] + numbers[j]));
                
                // Check if they add up to target
                if (numbers[i] + numbers[j] == target) {
                    System.out.println("\n✓ FOUND IT!");
                    System.out.println("Position " + i + " (value: " + numbers[i] + ")");
                    System.out.println("Position " + j + " (value: " + numbers[j] + ")");
                    System.out.println(numbers[i] + " + " + numbers[j] + " = " + target);
                    found = true;
                    break; // Stop searching
                }
            }
            if (found) break; // Exit outer loop too
        }
        
        // If no solution found
        if (!found) {
            System.out.println("\n✗ No two numbers add up to " + target);
        }
        
        input.close();
    }
}
