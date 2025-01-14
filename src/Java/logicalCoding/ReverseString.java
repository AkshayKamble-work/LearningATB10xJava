package Java.logicalCoding;

public class ReverseString {

    public static void main(String[] args)
    {
      String name="mom";
      String Reverse="";
        for (int i = name.length() - 1; i >= 0; i--)
        {

            Reverse=Reverse+name.charAt(i);
        }
        System.out.println("Input :: "+name);
        System.out.println("Output ::"+Reverse);
        System.out.println();
        System.out.println("---Checking String is Palindrome or not---");
        if(name.equals(Reverse))
        {
            System.out.println(name+" String is Palindrome ");
        }
        else{
            System.out.println(name+" String is  not Palindrome ");
        }
    }
}
