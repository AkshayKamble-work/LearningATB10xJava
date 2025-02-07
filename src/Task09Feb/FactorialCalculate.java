package Task09Feb;

public class FactorialCalculate {

    public static void main(String[] args) {
        int no=5;
        int fact=1;
        System.out.println("Factorial Calculation..");
        for(int i=1;i<=no;i++)
        {
            fact=fact*i;
        }
        System.out.println("Factorial of "+no+" is "+fact);
    }
}
