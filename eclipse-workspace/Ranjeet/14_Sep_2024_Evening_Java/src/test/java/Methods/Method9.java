package Methods;

public class Method9 {

	public static void main(String[] args) {

		// first we have to create the object of class

		// syntax ---> classname rvn = new classname();

		Method9 demo = new Method9();

		Method9 demo1 = new Method9();

		Method9 demo2 = new Method9();

		// calling

		// Rvn.methodname();
		demo.softwareTesting();
		demo.automationTesting();
		demo.manualTesting();

		System.out.println();

		demo1.softwareTesting();
		demo1.manualTesting();
		demo1.automationTesting();

		System.out.println();

		demo2.softwareTesting();
		demo2.manualTesting();
		demo2.automationTesting();

	}

	public void softwareTesting() {

		System.out.println("Software testing");
	}

	public void manualTesting() {

		System.out.println("Manual testing");

	}

	public void automationTesting() {

		System.out.println("Automation testing");

	}

}
