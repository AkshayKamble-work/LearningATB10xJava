package AccessModifiers;

public class Public1 {

	public int number = 1000;
	
	public Public1() {
		
		
	}
	public static void main(String[] args) {
		
		
		Public1 P1  = new Public1();

		P1.M1();
		
		System.out.println(P1.number);
	}
	
	public void M1() {
		
		System.out.println("Public m1 method");
	}

}
