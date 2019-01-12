class Machine {
	public void start() {
		System.out.println("Starting Machine ...");
	}
	
	public void stop() {
		System.out.println("Stopping Machine ...");
	}
}

interface Plant {
	public void grow();
}

public class App {
	public static void main(String[] args) {
		
		Machine machine1 = new Machine() {
			@Override public void start() { // Child class of machine (anonymous - no name)
				System.out.println("Camera Snapping ...");
			}
			@Override public void stop() {
				System.out.println("Camera Stopping ... ");
			}
		};
		
		machine1.start();
		machine1.stop();
		
		Plant plant1 = new Plant() {

			@Override
			public void grow() {
				// TODO Auto-generated method stub
				System.out.println("Plant Growing");
			}
			
		};
		
		plant1.grow();
	}
}
