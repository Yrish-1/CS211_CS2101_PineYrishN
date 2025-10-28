import java.util.Scanner;

public class GradeCalculator {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of grades: ");
        int n = input.nextInt();

        System.out.print("Enter grades: ");
        int[] grades = new int[n];
        for (int i = 0; i < n; i++) {
            grades[i] = input.nextInt();
        }

        System.out.println();

        int[] passing = new int[100];
        int[] failing = new int[100];
        int passingG = 0;
        int failingG = 0;

        for (int i = 0; i < n; i++) {
            int grade = grades[i];
            int adjustedG = grade;

            if (grade >= 78) {
                int multiple = (grade / 5) * 5;
                int diff = multiple - grade;

                if (diff < 3) {
                    adjustedG = multiple;
                }
            }
            if (adjustedG >= 80) {
                passing[passingG] = adjustedG;
                passingG++;
            } else {
                failing[failingG] = adjustedG;
                failingG++;
            }
        }

        if (passingG > 0) {
            System.out.print("Passed: ");
            for (int i = 0; i < passingG; i++) {
                System.out.print(passing[i]);
                if (i < passingG - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        if (failingG > 0) {
            System.out.print("Failed: ");
            for (int i = 0; i < failingG; i++) {
                System.out.print(failing[i]);
                if (i < failingG - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        int stellarStar = passingG / 3;
        int tonitrusBolt = failingG;

        System.out.println();
        System.out.println("Stella Stars: " + stellarStar);
        System.out.println("Tonitrus Bolts: " + tonitrusBolt);

        input.close();
    }
}
