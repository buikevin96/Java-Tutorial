package world;

public class Plant {
	// Instance member variable
	public String name; // Bad practice, you want to encapsulate
	
	public final static int ID = 8; // Acceptable practice
	
	private String type;
	
	protected String size;
	
	int height;
	
	public Plant() {
		this.name = "Freddy";
		this.type = "plant";
		
		this.size = "medium";
		this.height = 8;
	}
}
