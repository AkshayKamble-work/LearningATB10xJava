package Methods;

public class Method8 { // Class name - Method8

	public static void main(String[] args) {
		
		System.out.println("Main method started");
		// Non static regular method calling from same class

		// Object creation syntax

		// classname refrencevariablename = new classname();

		Method8 obj = new Method8(); // Object name -- new Method8();

		// Non method calling syntax
		// refrencevariablename.methodname();
		
		obj.test1();
		obj.test2();

		System.out.println("Main method endend ");

	}

//	syntax
//	//Access mod  void methodname(){
//	
//    }

	public void test1() { // Non static regular method

		System.out.println("Non static regular method calling from same class -- test 1");
		

	}

	public void test2() { // Non static regular method

		System.out.println("Non static regular method calling from same class  -- test 2");
	}

}
