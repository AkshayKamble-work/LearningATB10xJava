package Arrayss;

import java.util.Arrays;

public class SecondLargest {
    public static void main(String[] args) {
        int a[]={1,2,31,12,14};
        System.out.println("Elements in Arrays  --> ");
        Arrays.sort(a);
        int secondLargest = a[a.length - 2];

        System.out.println("Largest number --> "+secondLargest);
    }
}
