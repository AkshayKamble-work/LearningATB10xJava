package Polymorphism;

public class Methodoverloading6 {

	// Main method overloading
	public static void main(String[] args) {

	/**
	 * Can we overload the main method - Yes we can 
	 */
		System.out.println("Stirng array input para method");

		Methodoverloading6.main(10);
		Methodoverloading6.main("Java");
		Methodoverloading6.main('T');
	}

	public static void main(int iddfff) {

		System.out.println("int input para method");
	}

	public static void main(String args1) {
		System.out.println("String input para method");

	}
	
	public static void main(char args1) {

		System.out.println("char input para method");

	}
}
