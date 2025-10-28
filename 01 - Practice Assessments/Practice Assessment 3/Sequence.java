import java.util.Scanner;

public class Sequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get input, asking the user to input 5 elements
        System.out.print("Enter the first 5 elements of the sequence: ");
        int[] terms = new int[5];
        for (int i = 0; i < 5; i++) {
            terms[i] = sc.nextInt();
        }

        System.out.print("Find which element: ");
        int n = sc.nextInt();// asking user to input number the user wants to find

        // Checking for arithmetic.
        int diff = terms[1] - terms[0];
        boolean isArithmetic = true;
        for (int i = 0; i < 4; i++) {
            if (terms[i + 1] - terms[i] != diff) {
                isArithmetic = false;
                break;
            }
        }

        if (isArithmetic) {
            int result = terms[0] + (n - 1) * diff;
            System.out.println("Element " + n + " is " + result);
        } else {
            // Check geometric
            float ratio = (float) terms[1] / terms[0];
            boolean isGeometric = true;
            for (int i = 0; i < 4; i++) {
                if ((float) terms[i + 1] / terms[i] != ratio) { // credits to chatgpt for the formula
                    isGeometric = false;
                    break;
                }
            }

            if (isGeometric) {
                int result = (int) (terms[0] * Math.pow(ratio, n - 1));// credits to Copilot for the Math.pow
                System.out.println("Element " + n + " is " + result);
            } else {
                System.out.println("The sequence is neither arithmetic nor geometric.");
            }
        }

        sc.close();// para maiwasan ang memory waste/ leak
    }
}

/*
 * How did it happen? let's solve it heheh
 * let's say we putted 2,4,6,8,10
 * then we want to find the n = 9
 * 
 * to apply the formula
 * 
 * int diff = terms[1] - terms[0]; allows us to know the difference between
 * terms
 * terms[4] - terms[2] = 2 which means 2 is the difference
 * boolean isArithmetic = true; checks if it is arithmetic, let's say it returns
 * true
 * 
 * for (int i = 0; i < 4; i++) {
 * if (terms[i + 1] - terms[i] != diff) {
 * isArithmetic = false;
 * break;
 * }
 * } this will check if the other terms will also result 2 in difference if true
 * it will go to another loop which is
 * 
 * if (isArithmetic) {
 * int result = terms[0] + (n - 1) * diff;
 * System.out.println("Element " + n + " is " + result); this formula will help
 * in which element does your input n belong to
 * applying formula: result = terms[2] + (9-1) * 2 = 18 then it will be printed
 * out
 * 
 */
