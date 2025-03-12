package logicalProgram;

public class RepeatedWords {


	//input aabbbbccc
	//output a2b4c3
	public static void main(String[] args) 
	{
		String str="AAAaaccCCCDDd";
		String Result=RepeatedWords.Test(str);
		System.out.println(Result);

	}

	public static String Test(String str)
	{
		StringBuilder sb=new StringBuilder();
		int count=1;

		for (int i = 1; i < str.length(); i++)
		{

			if (str.charAt(i)==str.charAt(i-1))
			{

				count++;
			} 
			else 
			{
				sb.append(str.charAt(i-1)).append(count);
				count=1;
			}
		}
		sb.append(str.charAt(str.length()-1)).append(count);
		return sb.toString();
	}
}
