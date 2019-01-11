class Robot {
	public void speak(String text) {
		System.out.println(text);
	}
	
	public void jump(int height) {
		System.out.println("Jumping: " + height);
	}
	
	public void move(String direction, double distance) {
		System.out.println("Moving " + distance + " meters in direction " + direction);
	}
}

public class App {
	public static void main(String[] args) {
		Robot sam = new Robot();
		sam.speak("Hey im sam");
		sam.jump(10);
		sam.move("north", 10.01);
		
		String greeting = "Hello there";
		sam.speak(greeting);
		
	}
}
