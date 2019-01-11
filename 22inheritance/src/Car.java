
public class Car extends Machine{
	
	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("Car Started");
	}

	public void wipeWindshield() {
		System.out.println("Wiping Windshield");
	}
	
	public void showInfo() {
		System.out.println("Car name: " + name);
	}
}
