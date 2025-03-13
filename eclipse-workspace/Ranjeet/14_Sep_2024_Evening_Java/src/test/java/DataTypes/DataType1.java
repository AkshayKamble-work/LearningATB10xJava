package DataTypes;

public class DataType1 {

	public static void main(String[] args) {

		
		//Primitive data Types
		
		//Numeric and Non-decimal Data Type

		//1.Byte Data type  - 1 Byte  == 8 bit  - Range (-128 to 127)
		
		//DataType variableName = variable Value;
		
		
		byte Nametest = 127;
		//byte void = 200;
		
		System.out.println("Byte Data Type -->"+Nametest);  //120
		
		byte B1 = 33;
		System.out.println("Byte data type --> " +B1);
		
		byte B2 = 127;  //Max value
		System.out.println("Max size of the byte data type --> "+B2);
		
		//byte  B22 = 128;
		
		byte B3 = -40;   
		System.out.println("Byte data type --> " +B3);
		
		byte B4 = -128;
		System.out.println("Min size of the byte data type -->"+ B4);
		
	//	byte B5 = -129;  //Not allowed
		
		
		//2. Short  - 2 byte  - 16 bit -- >range (-32768  to 32767)
		
		//DataType variableName = variable Value;
		
		System.out.println(); 
		short AutomationTesting  = 29;
		System.out.println(AutomationTesting);
		
		short S2 = 128;
	
		System.out.println("Short Data Type --> " + S2);  //128
		
		short S3 = 32767;
		System.out.println("Max of short data type -->" + S3);
		
	//	short S4 = 32768;
		
		short S4 = -200;
		System.out.println("Short Data Type -->"+S4);
		short S5 =-32768;
		System.out.println("Min of short data type --> "+ S5);
		
		//short  S6 = -32769;  Not allowed
		

	}

}
