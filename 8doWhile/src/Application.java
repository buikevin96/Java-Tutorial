import java.util.Scanner;

public class Application {
	public static void main(String[] args) {
		int value;
		
		// New scanner object to retrieve input
		Scanner scanner = new Scanner(System.in);
		
		/*
		// Print prompt
		System.out.println("Enter a number: ");
		// 
		int value = scanner.nextInt();
		
		// While the input is not 5, ask this question
		while(value != 5) {
			System.out.println("Enter a number:");
			value = scanner.nextInt();
		}
		*/
		
		do {
			System.out.println("Enter a number: ");
			value = scanner.nextInt();
		} while(value != 5);
		
		// When user enters 5, this line prints
		System.out.println("Got 5!");
	}
}
