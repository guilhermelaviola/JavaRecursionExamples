package examples.recursion.basic;

// Recursion is basically a method invoking itself within itself
public class HelloRecursive {

	// Test
	public static void main(String[] args) {
		System.out.println("RECURSIVE METHODS EXAMPLES:");
		System.out.println("");
		System.out.println("SAYING HELLO!");
		// Invoking sayHelloRecursive() in the main method
		sayHelloRecursive(10);

		System.out.println("");

		System.out.println("COUNTING BACKWARDS!");
		// Invoking countBackwards() in the main method
		countBackwards(20);
	}

	public static void sayHelloRecursive(int x) {
		// Once x is equal to zero, the "Done!" will be printed in the console, otherwise the message "Hello!" will be printed
		if(x == 0) {
			System.out.println("Saying hello done!");
		}else {
			System.out.println("Hello!");
			// An important rule of Recursion is to know when to stop executing the code (base case), otherwise your program will catch an exception
			x--;
			// The method invokes itself, as you can see below
			sayHelloRecursive(x);
		}
	}
	public static void countBackwards(int x) {
		// Once x is equal to zero, the "Done!" will be printed in the console, otherwise the next number in the descending order will be printed
		if(x == 0) {
			System.out.println("Counting backwards done!");
		}else {
			// Printing number
			System.out.println(x);
			// Counting backwards
			x--;
			// The method invokes itself, as you can see below
			countBackwards(x);
		}
	}
}
