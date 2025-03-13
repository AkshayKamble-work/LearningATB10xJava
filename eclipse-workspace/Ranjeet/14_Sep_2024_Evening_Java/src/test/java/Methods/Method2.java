package Methods;

public class Method2 { // Class body

	public static void main(String[] args) { // Starting point of the program
		System.out.println("Main method started");

		// 1. Direct calling by method name

		// Syntax - Methodname();
		System.out.println("Calling by methodname");
		Java();
		SoftwareTesting();
		Automation1();

		System.out.println();
		// 2. Calling by classname.methodname()
		// syntax - classname.methodname();

		System.out.println("Calling by classname.methodname");
		Method2.Automation1();
		Method2.SoftwareTesting();
		Method2.Java();
          
		System.out.println("Main method ended");
		
		
		
		
		
		
	}

	public static void Automation1() {

		System.out.println("Automation Testing1");
		System.out.println("Automation Testing2");
		System.out.println("Automation Testing3");
		System.out.println("Automation Testing4");
		System.out.println("Automation Testing5");
		System.out.println("Automation Testing6");

	}

	public static void Java() {

		System.out.println("Java programming");
	}

	public static void SoftwareTesting() {

		System.out.println("Software testing classes");
	}

  }
