package staticKeyword;

public class StaticVarriable
{
 static int  x=100;

    public static void main(String[] args)
    {
        System.out.println("before change the value of x "+StaticVarriable.x);// acccessing static varriable using class name

        StaticVarriable.x=200; // changing the value of static using classname
        System.out.println("After change the value of x "+StaticVarriable.x);// acccessing static varriable using class name

    }
}
