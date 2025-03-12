package Methods;

public class Method19 extends Method18{

	public static void main(String[] args) {

		
		
		Method19 M1 = new Method19();
		
		int sum = M1.add(30, 20);
		
		System.out.println(sum);
		
		Method19.Test();
		Method15.Addition1(10, 10, 10);
		
		String Name = M1.Demo("Java");
		System.out.println(Name);  //Java
		
		
		M1.M2("Test",44,22);   //Test44  + 22  66
		M1.M3(44,22,"Test");  //66Test
		
		Method19.Test1();
		Method19.addition(sum, sum);
		int t=M1.square(3);
		System.out.println(t);
		
		M1.demo1();
	}
	
	
    static int i=10;
     
     public static void Test1() {

    	 
    	 System.out.println();
  //   int ik= 20;
     System.out.println(i+i);    //40
     
    }
    
	public int add(int a,int b) {
		
		return a+b;
	}
	
	public String Demo(String name) {
		
		System.out.println(i);  //10

		return name;
	}
	
	
	public static void Test() {
		
		System.out.println("Static method");
	}
	
	public void M2(String i, int j,int k) {
		
		System.out.println(i+j+k);
	}
	
    public void M3(int j,int k,String i) {
		
		System.out.println(j+k+i);
	}

}
