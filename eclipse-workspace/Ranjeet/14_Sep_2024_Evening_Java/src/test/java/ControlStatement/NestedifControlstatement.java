package ControlStatement;

public class NestedifControlstatement {

	public static void main(String[] args) {

		
		//syntax
		
//		if(Condition) {
//			
//			if(Conditon) {
//				
//				//Code to be executed
//			}
//		}
//		
		int age =13;
		int weight = 48;
		
		if(age >=18) {   //33>=18   - True
			
			if(weight>40) {   //58>50 - True  48>50 - false
				
				System.out.println("You are eligible to donate blood");
			}
		}
		
	}

}
