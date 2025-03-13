package Arrayss;

import java.util.Arrays;

public class SortArrays {

    public static void main(String[] args) {
        int a[]={10,9,8,7,5,4,6,2,1,3,0};
        Arrays.sort(a);
        // First Way
        System.out.println(Arrays.toString(a));
        // second way
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+",");
        }
    }
}
