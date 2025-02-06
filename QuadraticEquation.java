import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input coefficients
        System.out.print("Enter the coefficient b: ");
        double b = scanner.nextDouble();
        System.out.print("Enter the constant c: ");
        double c = scanner.nextDouble();

        // Coefficient of x^2 is 1
        double a = 1;

        // Calculate discriminant
        double d = b * b - 4 * a * c;

        // Display the discriminant value
        System.out.println("Discriminant (d): " + d);

        if (d > 0) {
            // Two distinct real roots
            System.out.println("The roots are real and distinct.");
            double sqrtD = manualSquareRoot(d);
            double root1 = (-b + sqrtD) / (2 * a);
            double root2 = (-b - sqrtD) / (2 * a);
            System.out.println("Root 1: " + root1);
            System.out.println("Root 2: " + root2);
        } else if (d == 0) {
            // One real root
            System.out.println("The roots are real and equal.");
            double root = -b / (2 * a);
            System.out.println("Root: " + root);
        } else {
            // Complex roots
            System.out.println("The roots are complex and imaginary.");
            double realPart = -b / (2 * a);
            double imaginaryPart = manualSquareRoot(-d) / (2 * a);
            System.out.println("Root 1: " + realPart + " + " + imaginaryPart + "i");
            System.out.println("Root 2: " + realPart + " - " + imaginaryPart + "i");
        }

        scanner.close();
    }

    // Method to manually calculate the square root using the Babylonian method
    public static double manualSquareRoot(double number) {
        if (number < 0) {
            number = -number; // Handle negative for imaginary parts
        }
        double guess = number / 2;
        double epsilon = 1e-6; // Tolerance level

        while (Math.abs(guess * guess - number) > epsilon) {
            guess = (guess + number / guess) / 2;
        }
        return guess;
    }
}

output :
Enter the coefficient b : 2
Enter the coefficient c : 4
Discriminant (d) : -12.0
The roots are complex and imaginary 
Root 1 :-1.0+1.732
Root 2 : -1.0-1.732