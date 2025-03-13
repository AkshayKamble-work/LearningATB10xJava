package Constructor;

public class Rule5 {


	//We can n number constructor in a class but constructor name
	//should be same as class name
	

	public Rule5() {
		
		System.out.println("0 input parameter const");
		
	}
	
	public Rule5(int i) {
		
		System.out.println(i);
		System.out.println("int input parameter const");
		
	}
	
    public Rule5(String i) {
		
		System.out.println(i);
		System.out.println("String input parameter const");
		
	}
    
	public static void main(String[] args) {
		
		
		Rule5 R5 =  new Rule5();
		
		Rule5 R6  = new Rule5(10);
		
		Rule5 R7  = new Rule5("Testing");
		
	}
	
	
	

}
