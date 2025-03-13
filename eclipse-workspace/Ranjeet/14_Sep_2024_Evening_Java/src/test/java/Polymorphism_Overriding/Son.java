package Polymorphism_Overriding;

public class Son extends Father{

	
	
	@Override
	public void Car() {
		
		System.out.println("Car --  Seltos");
	}
	
	@Override
	public void Money() {
		System.out.println("Money 24lakh");
	}
	
	
	public void Test() {
		System.out.println("Test method");
	}
	
	public static void main(String[] args) {
		//  Refrence RVN  = Objectname
		Father F1 = new Father();   //Static binding /CTP /Early binding
		F1.Car(); 
		F1.Money();
		//F1.Test();
		
		
		Son S1  = new Son();
		S1.Car();   //
		S1.Money();  //
		S1.Test();
		
		Father F2 = new Son();   //Dynamic biinding/RTP/latebinding/up casting or top casting
		
	    F2.Car();     //  Car seltos
	    //F2.Test();
	    F2.Demo();    // Demo method
	    F2.Home();   // Home 2 BHK
	    F2.Money();  //Money 24lakh
		
		
		
		
		
	}
}
