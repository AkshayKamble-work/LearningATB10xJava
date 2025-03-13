package logicalProgram;

public class ReverseEachString {


	public static void main(String[] args) {
		//Input String :: XUV700
		//Output String :: 007VUX
		String s = "XUV700"; 
		String r = "";
		char ch;
		System.out.println("Input String :: "+s);
		for (int i = 0; i < s.length(); i++) {

			// extracts each character
			ch = s.charAt(i);

			// adds each character in
			// front of the existing string
			r = ch + r; 
		}

		System.out.println("Output String :: "+r);
		System.out.println();
		// Using String Builder
		System.out.println("Using String Builder");

		String name="Accenture";
		System.out.println("Input String :: "+name);
		StringBuilder sb=new StringBuilder();
		sb.append(name);
		sb.reverse();
		System.out.println("Output String :: "+sb);
		System.out.println();
		System.out.println("using String buffer");
		String s1="Accenture";
		System.out.println("Input :: "+s1);
		StringBuffer SB=new StringBuffer(s1);
		SB.reverse();
		System.out.println("Output :: "+SB);
	}
}
