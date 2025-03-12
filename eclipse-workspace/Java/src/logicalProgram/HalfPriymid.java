package logicalProgram;

public class HalfPriymid {

	/*
	 
*
**
***
****
*****
	 
	 */
	
	public static void main(String[] args) {
		
		int n=5;
		for (int i = 1; i <=n; i++)
		{
		
			for (int j = 1; j <=i; j++) 
			{
			
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		// Or 
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(j<=i)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print("");
				}
			}
			System.out.println();
		}
		
	}
}
