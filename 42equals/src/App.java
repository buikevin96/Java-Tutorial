class Person{
	private int id;
	private String name;
	
	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	// Compare 2 objects efficiently
	// Generate hashCode() and equals() in source
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
}
public class App {
	public static void main(String[] args) {
		
		System.out.println(new Object());
		
		Person person1 = new Person(5, "Bob");
		Person person2 = new Person(5, "Bob");
		
		System.out.println(person1.equals(person2));
		
		Double value1 = 7.2;
		Double value2 = 7.2;
		
		System.out.println(value1 == value2); // false
		System.out.println(value1.equals(value2)); // true
		
		Integer number1 = 6;
		Integer number2 = 6;
		
		System.out.println(number1 == number2);
		
		String text1 = "Hello";
		String text2 = "Hellodfadf".substring(0,5);
		
		System.out.println(text2);;
		
		System.out.println(text1 == text2);
		
		// Only use == if two references point at the same object
		// Always use == when comparing strings
	}
}
