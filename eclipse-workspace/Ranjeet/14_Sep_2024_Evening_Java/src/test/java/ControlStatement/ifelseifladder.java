package ControlStatement;

public class ifelseifladder {

	public static void main(String[] args) {

//		    if(condition 1) {
//			statement 1; executes when condition 1 is true
//			}
//			else if(condition 2) {
//			statement 2; /executes when condition 2 is true
//			}
//		    else if(condition 3) {
//			statement 2; /executes when condition 2 is true
//			}
//			else {
//			statement ; //executes when all the conditions are false
//			}

		int result = 62;

		if (result > 65) { // false
			System.out.println("Result  -- > Distinction");
		} else if (result > 60) { // false true
			System.out.println("Result  -- > First class");
		} else if (result > 55) { // false
			System.out.println("Result --> Higher second class");
		} else if (result > 50) { // false
			System.out.println("Result --> Second class");
		} else if (result > 35) { // True
			System.out.println("Result -- Pass");
		} else {
			System.out.println("Result -- pass");
		}
	}
	
	public void Test(){
		
	}

}
