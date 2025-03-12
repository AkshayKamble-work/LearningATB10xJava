package logicalProgram;

public class MultiplyNumber {
	public static void main(String[] args) {
		
		int a=2;
		int b=10;
		int Mul=0;
		for(int i=1;i<=b;i++)
		{
			Mul=Mul+a;
			System.out.println(Mul);// printing 2 tabs
		}
		
		int num1 =2;
		int num2 =20;
		int Mul1 =0;
		
                 // 1  ;1<=20
		         //       2<=20
		for(int i=1; i<=num2 ;i++) {
			//0  =0+10;
			Mul1=Mul1+num1;
			//10 =10+10;20
		}
		System.out.println("Mul of two num is --->"+Mul1);
	}

}
