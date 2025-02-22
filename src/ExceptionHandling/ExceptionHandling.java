package ExceptionHandling;

public class ExceptionHandling

{

    public static void main(String[] args) {
        int a=10;
        int b=0;
        try {
            int c=a/b;
            System.out.println("A divied By B is "+c);
        } catch (Exception e)
        {
            System.out.println("Reason of Excepption "+e.getMessage());
        }

    }
}
