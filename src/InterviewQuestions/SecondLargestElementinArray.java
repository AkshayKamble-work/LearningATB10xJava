package InterviewQuestions;

import java.lang.reflect.Array;
import java.sql.PseudoColumnUsage;
import java.util.Arrays;

public class SecondLargestElementinArray
{
    public static void main(String[] args) {
        int arr[]={1,2,3,4,212,12,44};

        Arrays.sort(arr);
        int SecondLargest=arr[arr.length-2];
        System.out.println("Second Largest Element in Array is --> "+SecondLargest);
    }

}
