package logicalProgram;

public class Vowels {

	public static void main(String[] args) 
	{
		
		
		System.out.println(stringContainsVowels("Hello")); // true
		System.out.println(stringContainsVowels("TV"));
		
		//

	
	}
	public static boolean stringContainsVowels(String input) {
		return input.toLowerCase().matches(".*[aeiou].*");
	}
}

