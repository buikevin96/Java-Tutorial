import world.Plant;

/*
 * private: only visible within same class
 * public: from anywhere
 * protected: subclass, and same package
 * no modifier: same package only
 */

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Plant plant = new Plant();
		
		System.out.println(plant.name);
		System.out.println(plant.ID);
		
		// System.out.println(plant.type); Wont Work
		
		// System.out.println(plant.size); Size is protected and plant is in different package
		
		//System.out.println(plant.height); // Wont work app/plant is in different package, height has package level visibility
	}

}
