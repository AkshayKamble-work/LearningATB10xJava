package logicalProgram;

public class SwappingTwonumber {

	public static void main(String[] args) {
		
		int a=10;
		int b=20;
		int c;
		System.out.println("Before Swappong values :"+a+" "+b);
		c=a;
		a=b;
		b=c;
		
		System.out.println("After Swappong values :"+a+" "+b);
		System.out.println();
		System.out.println("Without 3rd Varriable");
		
		int A=10;
		int B=20;
		System.out.println("Before Swappong values :"+A+" "+B);
		A=A+B;
		B=A-B;
		A=A-B;
		System.out.println("After Swappong values :"+A+" "+B);
	}
}
