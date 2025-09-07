import java.util.Scanner;
public class SuperDigit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);//allows the program to read what the user is prompting

        System.out.print("Enter an integer up to 18 digits: ");
        String num = input.nextLine();

        String Orig = num;  
        while (true) { 
           
            if (num.length() == 1) {
                break;//kapag single number lang break agad kasi the number itself is its superdigit
            }

            int sum = 0;

            for (int y = 0; y < num.length(); y++) {
                char ch = num.charAt(y);//mag loloop through sa ininput na number 
                if (ch >= '0' && ch <= '9') {
                    sum += ch - '0'; //kapag '0' ay 48 and so on (//4713 = 4 52-48 = 4)
                }
            }

            num = String.valueOf(sum);
        }

        System.out.println("Super Digit of " + Orig + ": " + num);
    }
}
