package InterviewQuestions.ArraysQuestions;

import java.util.Arrays;

public class SecondLargest {
/*
input : int arr[]={23,3,43,44,45,5,6,7,2};
output: Second Largest number is --> 44
 */
    public static void main(String[] args) {

         int arr[]={23,3,43,44,45,5,6,7,2};
        Arrays.sort(arr);
        int secondLarge=arr[arr.length-2];
        System.out.println("Second Largest number is --> "+secondLarge);
    }
}
