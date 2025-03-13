package Constructor;

public class Rule3 {

	//3.You should not declare any return type for the constructor (like void).
	 //or No Return Type: Constructors do not have a return type.
//	by mistake if u have added void in the constructor creation time so compiler will treated as a method.
	

	public void Rule3() {
		
		System.out.println("Hello");
	}
	
	public static void main(String[] args) {

		Rule3 R3 = new Rule3();
		
		R3.Rule3();
		
	}
	
	

}
