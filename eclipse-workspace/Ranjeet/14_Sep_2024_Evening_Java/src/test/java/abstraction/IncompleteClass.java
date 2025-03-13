package abstraction;

public abstract class IncompleteClass {

	public static void main(String[] args) {

	}

	public void M1() { // Method declaration - No static ccompete method

		System.out.println("M1 Method"); // Method definition
	}

	public abstract void M2(); // Incomplete method

	public abstract void M2(int i);

	public void M3() { // Method declaration - No static ccompete method

		System.out.println("M1 Method"); // Method definition
	}
}
