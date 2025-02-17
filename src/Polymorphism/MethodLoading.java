package Polymorphism;

public class MethodLoading
{
 void Add(int a, int b)
{
    int c=a+b;
    System.out.println("Addition of A and B is --> "+c);
}

 void Add(double A, double B)
{
    double c = A+B;
    System.out.println("Addition of A and B is --> "+c);
}
}
class methodloadingTest
{
    public static void main(String[] args)
    {

        MethodLoading m = new MethodLoading();
        m.Add(5, 10);         // Calls int version
        m.Add(5.5, 2.3);      // Calls double version

    }

}
