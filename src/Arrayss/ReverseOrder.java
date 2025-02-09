package Arrayss;

public class ReverseOrder {
    public static void main(String[] args) {

        int a[]={1,2,3,4,5,6,7,8,9};
        System.out.print("Reverse Array Element --> ");
        for(int i=a.length-1;i>=0;i--)
        {
            System.out.print(a[i]+",");
        }
    }
}
