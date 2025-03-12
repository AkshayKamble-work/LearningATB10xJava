package Methods;

public class Method17 {

	public static void main(String[] args) {

		Method17 M17 = new Method17();

		int value = M17.m1();

		System.out.println(value); // 40

		float value2 = M17.m2();

		System.out.println(value2); // 40.4

		char value3 = M17.m3();

		System.out.println(value3); // d

		int test = Method18.addition(3, 4);
		
		System.out.println(test);

	}

	// Declare a method with return type

	public int m1() { // Non static method

		System.out.println("M1 Method");

		return 40;   //int 

	}

	public float m2() {

		System.out.println("M2 Method");

		return 40.4f;

	}

	public char m3() {

		System.out.println("M3 Method");

		return 'd';

	}

}
