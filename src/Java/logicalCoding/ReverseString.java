package Java.logicalCoding;

public class ReverseString {

    public static void main(String[] args) {
      String name="Hello";
      String Reverse="";
        for (int i = name.length() - 1; i >= 0; i--)
        {

            Reverse=Reverse+name.charAt(i);
        }
        System.out.println("Input :: "+name);
        System.out.println("Output ::"+Reverse);
    }
}
