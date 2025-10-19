import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Get array size
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        
        // Get array elements
        int[] nums = new int[n];
        System.out.print("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        
        // Get target
        System.out.print("Enter target: ");
        int target = sc.nextInt();
        
        // Find the two numbers
        // Try every pair of numbers
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                
                // If this pair adds up to target
                if (nums[i] + nums[j] == target) {
                    // Print the answer and stop
                    System.out.println("Output: [" + i + "," + j + "]");
                    return; // Exit the program (we found the answer!)
                }
            }
        }
        
        sc.close();
    }
}
