package Polymorphism;

public class Methodoverlaoiding3 {

	public static void main(String[] args) {

		// Automatic promotion
		
		// Small size primitive data to large size data type
	
		//Byte --> int --> long --> float --> double

	    Methodoverlaoiding3 M3 = new Methodoverlaoiding3();

		// M3.Demo1(10);    // int
		// M3.Demo1('T');   // int
		// M3.Demo1(49.4d); //double
		// M3.Demo1(646466666666l);
	}

	public void Demo1(char i) {
		
		System.out.println("Char input para method");
	}

	public void Demo1() {

		System.out.println("O i/p param method");
	}

	public void Demo1(int i) {

		System.out.println("int i/p para method");
	}

	public void Demo1(double i) {

		System.out.println("Double i/p para method");
	}

	public void Demo1(float i) {

		System.out.println("Float i/p par amethod");
	}
	
	public void Demo1(long i) {

		System.out.println("long i/p par amethod");
	}

}
