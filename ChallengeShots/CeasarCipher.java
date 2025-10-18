import java.util.Scanner;

public class CaesarCipher {
    public static char decryptChar(char c, int shift) {
        // Check if it's an uppercase letter
        if (c >= 'A' && c <= 'Z') {
            // Shift backwards in the alphabet
            int position = c - 'A';  // Convert to 0-25
            position = (position - shift + 26) % 26;  // Shift back and wrap around
            return (char) ('A' + position);  // Convert back to char
        }
        // Check if it's a lowercase letter
        else if (c >= 'a' && c <= 'z') {
            // Shift backwards in the alphabet
            int position = c - 'a';  // Convert to 0-25
            position = (position - shift + 26) % 26;  // Shift back and wrap around
            return (char) ('a' + position);  // Convert back to char
        }
        // Not a letter, return as is
        else {
            return c;
        }
    }
    public static String decryptCipher(String cipher) {
        StringBuilder result = new StringBuilder();
        int i = 0;
        
        while (i < cipher.length()) {
            char currentChar = cipher.charAt(i);
            
            // Check if current character is a digit (shift value)
            if (currentChar >= '0' && currentChar <= '9') {
                int shift = currentChar - '0';  // Convert char to int
                i++;  // Move to next character
                
                // Decrypt all characters until we hit another digit or space
                while (i < cipher.length()) {
                    char c = cipher.charAt(i);
                    
                    // If we hit a digit, break (new shift value coming)
                    if (c >= '0' && c <= '9') {
                        break;
                    }
                    // If it's a space, add it and break (new segment)
                    else if (c == ' ') {
                        result.append(c);
                        i++;
                        break;
                    }
                    // Otherwise, decrypt the character
                    else {
                        result.append(decryptChar(c, shift));
                        i++;
                    }
                }
            }
            else {
                // If not a digit, just add it (shouldn't happen in valid input)
                result.append(currentChar);
                i++;
            }
        }
        
        return result.toString();
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get input from user
        System.out.print("Enter cipher: ");
        String cipher = scanner.nextLine();
        
        // Decrypt and display result
        String decrypted = decryptCipher(cipher);
        System.out.println(decrypted);
        
        scanner.close();
    }
}
