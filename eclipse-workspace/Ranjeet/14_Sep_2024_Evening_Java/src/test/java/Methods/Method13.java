package Methods;

public class Method13 {

	public static void main(String[] args) {

		Method13.Demo();
		Method13.Demo1();
		Method13.Additon(10, 30); // 40
		Method13.Additon(1000, 2000); // 3000
	}

	public static void Demo() { // Zero i/p

		int x = 50;
		int y = 50;
		int z = x + y;

		System.out.println("Addition of two nmber -->" + z);

	}

	public static void Demo1() { // Zero i/p

		int x = 20;
		int y = 20;
		int z = x + y;

		System.out.println("Addition of two nmber -->" + z);

	}

	public static void Additon(int a, int b) { // Two input parameter method

		int add = a + b; // 10 + 30 = 40
		System.out.println("Addition of two nmber -->" + add);

	}

}
