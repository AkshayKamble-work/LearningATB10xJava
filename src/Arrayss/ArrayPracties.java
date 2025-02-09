package Arrayss;

public class ArrayPracties {

    public static void main(String[] args) {

        int []a ={1,2,3,4,5,6}; //not a fixed sized arrays
        System.out.println(a[0]);// accessing array element using index number
        System.out.println("Length of arrays is "+a.length);// length alway start with 1 and index is alway start with 0

        int b[]=new int [4];// fixed sized
        b[0]=10;
        b[1]=20;
        b[2]=30;
        b[3]=40;
        System.out.println("Length of arrays is --> "+b.length);
        System.out.print("Element in Array is ");
        for(int i=0;i<b.length;i++)
        {
            System.out.print(b[i]+",");
        }

    }
}
