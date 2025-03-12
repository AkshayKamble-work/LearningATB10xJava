package ThisAndSuper;

public class Sample1 {

	int RollNumber1  = 44;
	String name = "Ketan";
	
	//
	public static void main(String[] args) {
		
		Sample1 S1 = new Sample1();
		
//		System.out.println(S1.RollNumber);
//		System.out.println(S1.name);
		S1.Demo();
		
	}
	
	public void Demo() {
		
		int RollNumber = 55;
		String name = "Akshay";
		
		System.out.println(name);   //ketan
		System.out.println(RollNumber);  //55
		
		System.out.println(this.RollNumber1);  //44
		System.out.println(this.name);  //ketan
		
		
	}

}
