import java.util.Scanner;

public class Application {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter a command: ");
		String text = input.nextLine();
	
		switch(text) {
			case "start":
				System.out.println("Machine started");
				break;
				
			case "stop":
				System.out.println("Machine stoppped");
				break;
				
			default:
				System.out.println("Command not recognized");
			
				
		}
	}
}
