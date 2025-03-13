package Constructor;

public class Needofconstructor1 {

	
	String model;   // nonstatic global var
	int year;       // nonstatic global var
	
	
	public Needofconstructor1(String Model,int Year){
		
		model  = Model;
		year =  Year;
		
	}
	
	public static void main(String[] args) {
		
		
		Needofconstructor1 NC1  = new Needofconstructor1("TATA",2023);
		Needofconstructor1 NC2  = new Needofconstructor1("KIA",2024);
//		Needofconstructor1 NC3  = new Needofconstructor1();
		
		
		System.out.println(NC1.model+" "+NC1.year);   //TATA  2023
		System.out.println(NC2.model+" "+NC2.year);   //KIA 2024
		System.out.println(NC1.model+" "+NC1.year);   //TATA  2023
		System.out.println(NC2.model+" "+NC2.year);   //KIA 2024
		
		

	} 
	


}
