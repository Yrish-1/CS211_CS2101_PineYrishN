import java.util.Scanner;
//same as example lang ito ni ma'am kanina
public class FizzBuzz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an upper bound: ");
        int upperBound = scanner.nextInt();

        System.out.println("FizzBuzz Output:");

        // loop mula 1 hanggang sa upperBound
        for (int i = 1; i <= upperBound; i++) {
            // check kung divisible by both 3 and 5
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            }
            // check kung divisible by 3 lang
            else if (i % 3 == 0) {
                System.out.println("Fizz");
            }
            // check kung divisible by 5 lang
            else if (i % 5 == 0) {
                System.out.println("Buzz");
            }
            // Kung hindi divisible by 3 or 5, i-print yung number
            else {
                System.out.println(i);
            }
        }

        scanner.close(); //huwag daw ito kalimutan
    }
}
