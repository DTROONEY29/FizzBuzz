import java.util.Scanner;

/**
 * FIZZBUZZ INTERVIEW PRACTICE 1
 * User enters number
 * If number is divisible by 5, return fizz
 * If number is divisible by 3, return buzz
 * If number is divisible by both, return fizz buzz
 * If number is divisible by neither, return user input.
 */


public class Main {
    public static void main(String[] args) {
        // Declare and initialise variables
        final double fizz = 5.0;
        final double buzz = 3.0;
        // Welcome message
        System.out.println("This is fizzBuzz!");
        // Create scanner
        Scanner scanner = new Scanner(System.in);
        // User prompt
        System.out.print("Please enter a number: ");
        // get input and store as variable "input".
        double input = scanner.nextDouble();
        // If variable "input" is divisible by 3 & 5 print "FizzBuzz!"

        if (input % 15.0 == 0)
            System.out.println("FizzBuzz!");
            // If variable "input" is divisible by 5 print "Fizz!"

        else if (input % fizz == 0)
            System.out.println("Fizz!");
            // If variable "input" is divisible by 3 print "Buzz!"

        else if (input % buzz == 0)
            System.out.println("Buzz!");
            // If divisible by none, return  input
        else
            System.out.println(input);
        ;

    }
}
