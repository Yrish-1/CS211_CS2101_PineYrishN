import java.util.Scanner;

public class IntegerToRoman {
    public static String intToRoman(int num) {
        // Define value-symbol pairs in descending order
        // Include subtractive forms (IV, IX, XL, XC, CD, CM)
        int[] values = {
            1000, 900, 500, 400,
            100, 90, 50, 40,
            10, 9, 5, 4,
            1
        };
        
        String[] symbols = {
            "M", "CM", "D", "CD",
            "C", "XC", "L", "XL",
            "X", "IX", "V", "IV",
            "I"
        };
        
        StringBuilder result = new StringBuilder();
        
        // Process each value-symbol pair
        for (int i = 0; i < values.length; i++) {
            // Count how many times the current value fits into num
            //dito cinocount kung ilan or saan siya papasok
            int count = num / values[i];
            
            if (count > 0) {
                // Append the symbol 'count' times
                for (int j = 0; j < count; j++) {
                    result.append(symbols[i]);
                }
                // Subtract the value from num
                num -= values[i] * count;
            }
        }
        
        return result.toString();
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get input from user
        System.out.print("Enter number: ");
        int num = scanner.nextInt();
        
        // Validate input
        if (num < 1 || num > 3999) {
            System.out.println("Number must be between 1 and 3999");
        } else {
            // Convert and display result
            String roman = intToRoman(num);
            System.out.println("Roman Numeral: " + roman);
        }
        
        scanner.close();
    }
}
