package ThisAndSuper;

public class Sample3 extends Sample2{

	
	
	int RollNo = 5000;
	String Name = "Selenium";
	
	public static void main(String[] args) {

		Sample3 S3 = new Sample3();
		S3.Demo();
	}
	
	
	public void Demo() {
		
	    int RollNo = 2000;
		String Name = "Java";
		
		System.out.println(RollNo);   //2000
	
		
		System.out.println(this.RollNo);  //5000
		
		System.out.println(super.RollNo);   //3000
		 
		System.out.println(Name);  //java
		System.out.println(this.Name);   //selenium
		System.out.println(super.Name);  //automation
		
	} 

}
