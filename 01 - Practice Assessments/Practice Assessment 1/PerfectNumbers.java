import java.util.Scanner;

public class PerfectNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int sum = 0;

        //  proper divisors 
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i; // i-add natin yung divisor sa total
            }
        }

        // i-check kung equal yung sum ng divisors sa original number
        if (sum == number) {
            System.out.println(number + " is a perfect number.");
        } else {
            System.out.println(number + " is not a perfect number.");
        }

        scanner.close(); 
    }
}

//fighting!!!!!!!
