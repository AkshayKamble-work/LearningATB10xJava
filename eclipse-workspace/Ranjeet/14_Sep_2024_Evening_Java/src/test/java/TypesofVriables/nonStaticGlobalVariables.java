package TypesofVriables;

public class nonStaticGlobalVariables {

	
	static int rollNumber  = 20;  //No static global varibles
	
	String Name = "Akash";  
	
	public static void main(String[] args) {

		nonStaticGlobalVariables nv = new nonStaticGlobalVariables();
		System.out.println(rollNumber);
		System.out.println(differentClass.name);  //20
		System.out.println(nv.Name);   //Akash
		
		nv.M1();
		
		differentClass dc = new differentClass();
		System.out.println(dc.test1);
		System.out.println(dc.Test2);
		
	}

	
	public void M1() {
		
		System.out.println(rollNumber);   //20 
		System.out.println(Name);   //Akash
		
		rollNumber =44;
		Name = "Virat";
		
		System.out.println(rollNumber);   //20 
		System.out.println(Name);   //Akash
		

	}

}
