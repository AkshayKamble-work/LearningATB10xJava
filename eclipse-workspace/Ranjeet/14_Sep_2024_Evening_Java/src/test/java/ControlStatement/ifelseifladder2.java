package ControlStatement;

public class ifelseifladder2 {

	public static void main(String[] args) {

		int day = 13;
		
		if(day == 1) {   //false
			System.out.println("Sunday");
		}
		else if(day == 2) {  //false
			System.out.println("Monday");
		}
		else if(day == 3) {  //True  false
			System.out.println("Tuesday");
		}
		else if(day == 3 ) {
			System.out.println("Wednesday");
		}
		else if(day ==12) {
			System.out.println("Thrusday");
		}
		else if(day ==3) {
			System.out.println("Firday");
		}
		else if(day ==7) {
			System.out.println("Saturday");
		}
		else {
			System.out.println("Invalid day");
		}
		System.out.println("Hello");
	}
	
	

}
