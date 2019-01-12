import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App {
	public static void main(String[] args) throws FileNotFoundException{
		
		//String fileName = "/Users/kevinbui/Desktop/example.txt";
		String fileName = "example.txt";
		
		// Brings in the txt
		File textFile = new File(fileName);
		
		// Reads the txt
		Scanner in = new Scanner(textFile);
		
		int value = in.nextInt(); // Sets value to the integer line
		System.out.println("Read value: " + value);
		
		in.nextLine(); // Reads the newline character
		
		// Reads each line after interval
		int count = 2;
		while(in.hasNextLine()) {
			String line = in.nextLine();
			System.out.println(count + ": " + line);
			count++;
		}
		
		// Close the file
		in.close();
	}
}
