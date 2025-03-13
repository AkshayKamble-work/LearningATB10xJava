package Polymorphism_Overriding;

public class ReturnType1 {


	/**
	 * Child class return type is allowed object to String 
	 * Object  ---> Object/String/SttingBuffer/StringBuilder
	 * String  -->  object  - Not allowed
	 * int     -->  double/long -- only applicable object type
	 * @return
	 */
	public Object Demo1() {

		System.out.println("ReturnType1 demo2 method");
		return null;
	}

	public String Demo2() {

		System.out.println("ReturnType1 demo2 method");
		String S1 = "TEst";

		return S1;
	}

	public int Demo3() {

		System.out.println("ReturnType1 demo3 method");
		int T1 = 28;

		return T1;
	}

}
