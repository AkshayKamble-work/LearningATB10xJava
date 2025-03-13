package logicalProgram;

public class Fibonaccis {

	public static void main(String[] args) 
	{
		//FS = Next number is the sum of previous two numbers
		System.out.print("FS Series:: ");
		//0,1,1,2,3,5,8,13,21,34,55,......
		int a=-1;
		int b=1;
		int c;

		for(int i=0;i<=5;i++)
		{		
		c=a+b;// c=-1+1 =0    1
		a=b;//1
		b=c;//0
		System.out.print(c+",");
		
		}
		System.out.println();
		int no1=-1;
		int no2=1;
		int no3=0;
		System.out.print("FS Series:: ");
		for(int j=0;j<=5;j++)
		{
			no3=no1+no2;
			no1=no2;
			no2=no3;
			System.out.print(no3+",");
		}

	}

}
