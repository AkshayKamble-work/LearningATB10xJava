package abstraction;

public class CompleteClass {

	public static void main(String[] args) {

		CompleteClass CC = new CompleteClass();

		CC.M1();
		CC.M2();
	}

	public void M1() { // Method declaration

		System.out.println("M1 Method"); // Method definition
	}

	public void M2() {

		System.out.println("M2 Method");
	}

}
