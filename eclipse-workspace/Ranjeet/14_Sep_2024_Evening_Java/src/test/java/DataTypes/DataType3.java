package DataTypes;

public class DataType3 {

	public static void main(String[] args) {

		// Numeric and decimal Example -- 44.55, 32.55;

		// Float - 4 Byte - 32 Bit

		// Syntx - DataType variablename = variableValue;

		// int I1 =12.33;
		
		
		float F1 = 33;

		float F2 = 4546.96f; // f 1

		float F3 = -344;

		float F4 = -344.5677f;

		System.out.println("Float data Type -- >  " + F1);
		System.out.println("Float data Type -- >  " + F2);
		System.out.println("Float data Type -- >  " + F3);
		System.out.println("Float data Type -- >  " + F4);

		// We can store int value in float data type but we can not store float data
		// type value into int data type.

		System.out.println("*****************************");

		// Double data type - 8 byte - 64 bit

		// Syntx - DataType variablename = variableValue;

		double D1 = 30;
		double D2 = 330.45d; // d
		double D3 = -440;

		double D4 = 555555.234567;

		System.out.println("Double data Type D1 -->" + D1);// 30
		System.out.println("Double data Type D1 -->" + D2);
		System.out.println("Double data Type D1 -->" + D3);// 30
		System.out.println("Double data Type D1 -->" + D4);// 30

		float FF = 3.0f;
		float DD = 4.0f;

		float SS = FF + DD;
		float SSs = FF * DD;
		float SSSS = FF / DD;
		System.out.println(SS);
		System.out.println(SSs);
		System.out.println(SSSS);

	}

}
