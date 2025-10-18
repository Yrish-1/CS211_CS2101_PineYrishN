import java.util.HashMap;
import java.util.Scanner;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        // HashMap to store: value -> index
        HashMap<Integer, Integer> map = new HashMap<>();
        
        // Loop through each number in the array
        for (int i = 0; i < nums.length; i++) {
            // Calculate what number we need to reach target
            int complement = target - nums[i];
            
            // Check if complement exists in our map
            if (map.containsKey(complement)) {
                // Found it! Return both indices
                return new int[] { map.get(complement), i };
            }
            
            // Store current number and its index in map
            map.put(nums[i], i);
        }
        
        // No solution found (shouldn't happen per problem constraints)
        return new int[] { -1, -1 };
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get array size
        System.out.print("Enter array size: ");
        int n = scanner.nextInt();
        
        // Create and populate array
        int[] nums = new int[n];
        System.out.print("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        
        // Get target
        System.out.print("Enter target: ");
        int target = scanner.nextInt();
        
        // Find solution
        int[] result = twoSum(nums, target);
        
        // Display result
        System.out.println("Output: [" + result[0] + "," + result[1] + "]");
        
        scanner.close();
    }
}
