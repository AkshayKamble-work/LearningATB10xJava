package Methods;

public class Method7 {

	public static void main(String[] args) {

		System.out.println("Hi hello");
		
		//Calling by classname.methodname();   //sum ,mul ,div
		
		Method6.sum();   //Hi
		
		Method6.Div();   //good evening
		
		Method6.Mul();   //hello
		//Method7.Mul();  //Not allowed
		
		Method7.Demo5();  //same class
		
	}
	
	public static void Demo5() {
		
		System.out.println("Demo 5 method");
		
	}

}
