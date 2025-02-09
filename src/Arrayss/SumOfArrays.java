package Arrayss;

public class SumOfArrays {
    public static void main(String[] args)
    {
        int a[]={1,24,1,3};
        int sum=0;
        for(int i=0;i<a.length;i++)
        {
            sum=sum+a[i];
        }
        System.out.println("Sum of Array Element is --> "+sum);
    }
}
