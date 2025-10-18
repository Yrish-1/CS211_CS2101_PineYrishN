import java.util.Scanner;

public class FloydsTriangle {
    public static void printFloydsTriangle(int rows) {
        int currentNumber = 1;
        
        // Loop through each row
        for (int i = 1; i <= rows; i++) {
            // Print numbers in current row
            for (int j = 1; j <= i; j++) {
                System.out.print(currentNumber);
                
                // Add space after number (except for last number in row)
                if (j < i) {
                    System.out.print(" ");
                }
                
                currentNumber++;
            }
            
            // Move to next line after completing a row
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get input from user
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        
        // Validate input
        if (rows < 1) {
            System.out.println("Number of rows must be at least 1");
        } else {
            // Display Floyd's Triangle
            System.out.println("Floyd's Triangle with " + rows + " rows:");
            printFloydsTriangle(rows);
        }
        
        scanner.close();
    }
}
