package logicalProgram;

public class ReverseHalf {
/*
 
*****
****
***
**
*
 
 */
	
	public static void main(String[] args) 
	{
		
		
		int n=5;
		for(int i=n;i>=1;i--)
			
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		// OR
		System.out.println();
		for(int i=1;i<=5;i++)
		{
			for(int j=1; j<=5;j++)
			{
				if(j>=i)
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
