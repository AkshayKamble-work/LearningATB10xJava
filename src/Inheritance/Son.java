package Inheritance;

public class Son extends Father
{
void Bike()
{
    System.out.println("Son bike TVS");
}
void Macbook()
        {
    System.out.println("Son macbook");
}
}
class Inheritance
{
    public static void main(String[] args)
    {

        Father f=new Father();
        f.Car();
        f.bankBal();
        f.Land();
        f.House();
        // father class propety

        Son s=new Son();
        s.Car();
        s.bankBal();
        s.Land();
        s.House();
        s.Bike();
        s.Macbook();
    }
}