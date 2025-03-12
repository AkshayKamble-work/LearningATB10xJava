package Constructor;

public class DefaultConstructor1 {

	String name;   //null 
	int No;    //0
	
//	public DefaultConstructor1() {
//		
//		super();
//		
//	}
	
	//Rules of default constructor
	//1. It always zero argument or input parameter constructor
	//2. Access modifiers of the default constructor is same as class modifiers
	//3. Default constructor contains only one line that is super() call.
	
	
	public static void main(String[] args) {

		DefaultConstructor1 DC1 = new DefaultConstructor1();
		
		DC1.Test();
		
	}
	
	public void Test() {
		
		System.out.println(name+" "+No);
	}

}
