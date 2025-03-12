package JavaLoops;

public class doWhileLoop {
	public static void main(String[] args) {

		// WAP to print 1 to 5 numbers
		// Strating number 1
		// ending number =5
		// in by 1

		int num = 1;

		do {
			System.out.println(num); // 1 2 3 4 5
			num++; // 2 3 4 6
		}
		while (num <= 5); // false true true true false

		System.out.println("Program completed");

	}

}
