
public class App {
	public static void main(String[] args) {
		Plant plant1 = new Plant();
		Tree tree = new Tree();
		
		Plant plant2 = tree;
		
		plant2.grow();
		tree.shedLeaves();
		
		Plant plant3; // Null reference
		
		doGrow(tree);
	}
	
	public static void doGrow(Plant plant) {
		plant.grow();
	}
}
