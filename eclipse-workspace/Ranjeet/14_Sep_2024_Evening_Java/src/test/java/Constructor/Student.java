package Constructor;

public class Student {

	String name ;
	int RollNumber ; 
	
	
	public Student(String Name, int Rollnumber) {
		
		name = Name;
		RollNumber = Rollnumber;
		
	}
	
	//Need of constructor
	
	//Once we create an object compulsary we required to perfrom initilaiztion fit that object
	//if your not performaning initializatiin then object is not responding correct output
	
	public static void main(String[] args) {

		 
		
		Student S1  = new Student("Akash",32);  
		Student S2  = new Student("Virat",44); 
		Student S3  = new Student("Rohit",55); 
	    Student S100  = new Student("Rahul",67); 

		
	    System.out.println(S1.name+" "+S1.RollNumber);   //null ,0  Rohit 10   //Akash 32
	    System.out.println(S2.name+" "+S2.RollNumber);   //null ,0  Rohit 10   //Virat 44
	    System.out.println(S3.name+" "+S3.RollNumber);   //null, 0  Rohit 10   //Rohit 55
	    System.out.println(S100.name+" "+S100.RollNumber); 
	   
		
	    // Who is responsible for initializing object  - constructor
	    // Constructor is special type of method/functions
	    //Every time n object is created using new keyword at least one constructor is called
	    
	    
	}

}
