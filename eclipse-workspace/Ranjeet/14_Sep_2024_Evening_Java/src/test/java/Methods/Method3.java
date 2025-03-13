package Methods;

public class Method3 {

	public static void main(String[] args) {

		
		
		//Calling by methodname
		sameTest();
		
		//Calling by classname method name
		Method3.sameTest();
		
	}
	
	
	public static void sameTest() {
		
		
		System.out.println("Same class");
	}

}
