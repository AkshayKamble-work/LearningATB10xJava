package AccessModifiers;

public class DiffClass {

	public static void main(String[] args) {

		Public1 P2  = new Public1();
		
		P2.M1();
		System.out.println(P2.number);
		
		
//		Private1 P3 = new Private1();
//		P3.D1();
//		System.out.println(P3.No);
		
		Default1 D1 = new Default1();
		
		System.out.println(D1.Test);
		D1.T1();
		
		Protected1 P4 = new Protected1();
		
		P4.P1();
		System.out.println(P4.name);
	}

}
