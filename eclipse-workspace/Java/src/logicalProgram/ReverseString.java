package logicalProgram;

public class ReverseString {

	
	public static void main(String[] args) {
		
		String Name="Hello";
		String Revers="";
		System.out.println("Input :: "+Name);
		for(int i = Name.length() - 1; i >= 0; i--)
		{
			Revers=Revers+Name.charAt(i);
		}
		System.out.println("Output :: "+Revers);
		

		
	}
	
	
}
