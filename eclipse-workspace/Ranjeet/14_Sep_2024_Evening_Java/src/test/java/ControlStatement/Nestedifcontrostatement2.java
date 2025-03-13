package ControlStatement;

public class Nestedifcontrostatement2 {

	public static void main(String[] args) {

		
		//syntax
		
//		if(conditon) {
//			
//			if(conditon) {
//				//executed both if condition trues
//			}
//		}
//	}
		
		int age =20;
		int weight =45;
		
		if(age >= 18) {   //True  10>=18  - False true
			
		    if(weight>=50) {   //true  45>=50  - false
		    	System.out.println("You are eligble for blood donation");
		    }
		    else {
		    	System.out.println("You are not eligble for blood donation");
		    }
		}
		else {
			System.out.println("age must be greater than 18");
		}
		System.out.println("PC");
	}

}
