import java.util.Scanner;

public class Application {
	public static void main(String[] args) {
		
		// Creates scanner object
		Scanner input = new Scanner(System.in);
		
		// Output prompt
		System.out.println("Enter an integer: ");
		// Waits for user input
		// String line = input.nextLine();
		// double value = input.nextDouble();
		int value = input.nextInt();
		
		
		// Prints what the user entered 
		System.out.println("You entered: " + value);
	}
}
