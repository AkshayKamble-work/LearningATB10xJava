package ControlStatement;

public class Ifelseifladder3 {

	public static void main(String[] args) {

		String City  = "Pune";
		
		if(City == "PunE") {  //false  true  false
			 
			System.out.println("City is pune");
		}
		
		else if(City == "Pune") {  //True
			
			System.out.println("City is mumbai ");
			
		}
		else if(City == "Delhi") {
			System.out.println("City is delhi");
		}
		else {
			System.out.println("No mtch found");
		}
		
		System.out.println("PC");
	}

}
