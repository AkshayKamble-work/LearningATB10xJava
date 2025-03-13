package staticKeyword;

public class Examplestatic

{

static int price =100;
static String fruite="Apple";
static double kg=1;
static double totallAmmmount;

public static void Order()
{
    System.out.println("Price of Apple is "+price);
    System.out.println("Fruite name is "+fruite);
    System.out.println("Per KG "+kg);
    totallAmmmount=price*kg;
    System.out.println(totallAmmmount);
}


    public static void main(String[] args)

    {
   Order();
    }


}
