
public class App {
	public static void main(String[] args) {
		
		// One dimensional array
		int[] values = {3, 5, 2343};

		for(int i = 0; i < values.length; i++) {
			System.out.println(values[i]);
		}
		
		// int two dimensonal array
		int[][] grid = {
			{3, 5, 2343},
			{2, 4},
			{1, 2, 3, 4}
		};
		
		// [row][column]
		System.out.println(grid[1][1]);
		System.out.println(grid[0][2]);

		// String 2d array
		String[][] texts = new String[2][3];
		texts[0][1] = "Hello there";
		
		System.out.println(texts[0][1]);
		
		// Loops through the row (outer loop)
		for(int row = 0; row < grid.length; row++) {
			// Loops through the columns (inner loop)
			for(int col = 0; col < grid[row].length; col++) {
				System.out.println(grid[row][col] + "\t");
			}
			
		String[][] words = new String[2][];
		
		System.out.println(words[0]);
		
		// Manually input column into index 0
		words[0] = new String[3];
		
		words[0][1] = "hi there";
		System.out.println(words[0][1]);
		}
	}
}
