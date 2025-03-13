package Methods;

public class Method14 {

	public static void main(String[] args) {

		Method14.Mymethod("Rohit");
		Method14.Mymethod("Vikas");

	
		Method14.studentInfo("Rahul", 30);   //null, 0
		Method14.studentInfo("Virat", 40);
	}
	
	
	public static void Mymethod(String Firstname) {
		
		
		System.out.println("Firstname -->"+Firstname);
		
	}
	
	
	public static void studentInfo(String name, int age) {
		
		System.out.println(name + " "+age);

	}

}
