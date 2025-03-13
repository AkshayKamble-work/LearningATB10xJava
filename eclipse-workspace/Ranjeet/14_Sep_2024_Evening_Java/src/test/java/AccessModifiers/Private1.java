package AccessModifiers;

public class Private1 {

	private int No = 40;
	
	public static void main(String[] args) {

		Private1 P1  = new Private1();
		P1.D1();
		//System.out.println(P1.no);
		
	}
	
	private void D1() {
		
		System.out.println("Private method");
	}

}
