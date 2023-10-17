import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter their weight in kilograms
        System.out.print("Enter your weight in kilograms: ");
        double weight = scanner.nextDouble();

        // Prompt the user to enter their height in centimeters
        System.out.print("Enter your height in centimeters: ");
        double height = scanner.nextDouble();

        // Close the scanner to release resources
        scanner.close();

        // Convert height from centimeters to meters (1 meter = 100 centimeters)
        double heightInMeters = height / 100.0;

        // Calculate BMI using the formula: BMI = weight (kg) / (height (m) * height (m))
        double bmi = weight / (heightInMeters * heightInMeters);

        // Determine the BMI category and provide a description
        String category;
        if (bmi < 18.5) {
            category = "Underweight";
        } else if (bmi < 24.9) {
            category = "Healthy Weight";
        } else if (bmi < 29.9) {
            category = "Overweight";
        } else {
            category = "Obese";
        }

        // Display the calculated BMI and category
        System.out.println("Your BMI is: " + bmi);
        System.out.println("You are categorized as: " + category);
    }
}
