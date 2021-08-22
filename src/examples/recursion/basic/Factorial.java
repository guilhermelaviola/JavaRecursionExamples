package examples.recursion.basic;

import java.util.Scanner;

// Factorial is a (number x its predecessor) x predecessor... and so on.
// Example: !4 = 4 x 3 x 2 x 1 = 24
public class Factorial {

	// Test
	public static void main(String[] args) {
		// Scanner object instantiation
		Scanner s = new Scanner(System.in);
		System.out.println("FACTORIAL RECURSIVE:");
		System.out.println("Enter a value: ");

		// The user will enter a number and it'll be stored on a
		int a = s.nextInt();
		// Printing the result of the factorial method with a as a parameter
		System.out.println(factorialRecursive(a));

		// Closing the Scanner object
		s.close();	
	}

	// Factorial recursive method
	public static int factorialRecursive(int x) {
		// If the number entered by user is equal to 1, then it must return 1, since fact(1) = 1
		if(x == 1) {
			System.out.println("factorial("+ x +") = " + 1);
			return 1;
			// Otherwise, it must return the entered number and then repeat this operation as many times as needed, according to the size of the number you entered. It's done through recursion
		}else {
			// Printing the operation for each number
			System.out.println("factorial("+ x +") = " + x + " * factorial(" + (x-1) + ")");
			return x * factorialRecursive(x-1);
		}
	}
}
