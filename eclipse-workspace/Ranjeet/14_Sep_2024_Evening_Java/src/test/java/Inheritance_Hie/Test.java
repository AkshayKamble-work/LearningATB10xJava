package Inheritance_Hie;

public class Test extends Son3{

	
	public static void main(String[] args) {

			
	   Son1  S1 = new Son1();
		
	   S1.Bike();
	   S1.Car();
	   S1.Home();
	   S1.Money();
	   S1.Money1();
	   Son3.Money1();
	   
	   System.out.println();
	   Son2 S2 = new Son2();
	   S2.Mobile();
	   S2.Car();
	   S2.Home();
	   S2.Money();
	   
	   
	   System.out.println();
	   Son3 S3 = new Son3();
	   
	   S3.Laptop();
	  // S3.Mobile();
	   S3.Home();
	   S3.Car();
	   S3.Money();
	   
	   
	  
	}

}
