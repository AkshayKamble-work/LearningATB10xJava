package Methods;

public class Method10 {

	public static void main(String[] args) {

		// Can i access static method by using object references? -- Yes
		// And Yes we can access static method but it will throw warning message

		// The static method demoTest() from the type Method10 should be accessed in a
		// static way

		Method10 obj = new Method10();

		obj.myMethod();
		obj.demoTest();

	}

	public void myMethod() { // Non static method

		System.out.println("Non static method");

	}

	public static void demoTest() {   //zeros input parametert method

		System.out.println("Static method");
	}
}
