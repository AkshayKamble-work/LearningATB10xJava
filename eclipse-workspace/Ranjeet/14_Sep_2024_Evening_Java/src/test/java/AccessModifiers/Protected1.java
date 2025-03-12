package AccessModifiers;

import java.util.ArrayList;
import java.util.List;

public class Protected1 {

	protected String name = "Automation";
	
	public static void main(String[] args) {

		Protected1 P4 = new Protected1();
		
		P4.P1();
		System.out.println(P4.name);
		
		List<Integer> LL =  new ArrayList<Integer>();
	}

	
	protected void P1() {
		
		System.out.println("protected method");
	}
}
