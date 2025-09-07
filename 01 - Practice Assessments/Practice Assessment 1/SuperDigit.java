import java.util.Scanner;
public class SuperDigit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer up to 18 digits: ");
        String num = input.nextLine();

        String Orig = num;  
        while (true) {
           
            if (num.length() == 1) {
                break;
            }

            int sum = 0;

            for (int y = 0; y < num.length(); y++) {
                char ch = num.charAt(y);

                if (ch >= '0' && ch <= '9') {
                    sum += ch - '0';
                }
            }

            num = String.valueOf(sum);
        }

        System.out.println("Super Digit of " + Orig + ": " + num);
    }
}
