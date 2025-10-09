package testgrade;

import java.util.Scanner;

public class GradeCalculator {

    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the numerical score: ");

        // Check if the next input is an integer
        if (scanner.hasNextInt()) {
            int score = scanner.nextInt();
            String grade = "";
            String description = "";

            // Determine the grade based on the score using if-else-if statements
            if (score >= 93) {
                grade = "A";
                description = "Excellent";
            } else if (score >= 90) {
                grade = "A-";
                description = "";
            } else if (score >= 87) {
                grade = "B+";
                description = "";
            } else if (score >= 83) {
                grade = "B";
                description = "Good";
            } else if (score >= 80) {
                grade = "B-";
                description = "";
            } else if (score >= 77) {
                grade = "C+";
                description = "";
            } else if (score >= 73) {
                grade = "C";
                description = "Average";
            } else if (score >= 70) {
                grade = "C-";
                description = "";
            } else if (score >= 67) {
                grade = "D+";
                description = "";
            } else if (score >= 60) {
                grade = "D";
                description = "Poor";
            } else {
                grade = "F*";
                description = "Failure";
            }

            // Print the final grade and description
            System.out.println("Your Grade is: " + grade + " " + description);

        } else {
            // Handle invalid input
            System.out.println("Invalid input. Please enter a valid numerical score.");
        }

        // Close the scanner to prevent resource leaks
        scanner.close();
    }
}
