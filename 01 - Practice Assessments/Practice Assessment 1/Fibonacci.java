import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");

        int n = scanner.nextInt();
        int first = 0, second = 1;

        System.out.print("Fibonacci Sequence up to " + n + " terms: ");

        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");// magssilbing loop hanggang makuha yung inenter na number

            int next = first + second;// formula ata ito hehe (to study)
            first = second;
            second = next;
        }

        scanner.close();
    }
}
