package Arrayss;

import java.util.Arrays;

public class MergeArray
{
    public static void main(String[] args)
    {
        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};

        int mergedLength = array1.length + array2.length;
        int[] mergedArray = new int[mergedLength];

        System.arraycopy(array1,0, mergedArray, 0, array1.length);
        System.arraycopy(array2,0, mergedArray, array1.length, array2.length);
        System.out.println(Arrays.toString(mergedArray));

    }
}
