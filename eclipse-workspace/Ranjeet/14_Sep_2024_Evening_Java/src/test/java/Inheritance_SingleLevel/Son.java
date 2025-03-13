package Inheritance_SingleLevel;

public class Son extends father{

	
	public void Bike() {
		
		System.out.println("Bike -- FZ");
	}
	
	public static void main(String[] args) {
		
		
		Son S1  = new Son();
		
		S1.Bike();
		S1.Home();
		S1.Car();
		S1.Money();
			
		
	}
}
