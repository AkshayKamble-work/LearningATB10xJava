package Polymorphism_Overriding;

public class PrivateMethod2 extends PrivateMethod1{


	private void M1() {
		
		System.out.println("Private method M1 - 2");
	}
	
	public static void main(String[] args) {
		
		PrivateMethod2 P2 = new PrivateMethod2();
		
	    P2.M1();
	    
	    
	    PrivateMethod1 P1 = new PrivateMethod2();
	    
	  //P1.M1();
	    P1.M3();
	    
	    
	}

}
