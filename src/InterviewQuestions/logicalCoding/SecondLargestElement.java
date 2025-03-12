package InterviewQuestions.logicalCoding;

import java.util.Arrays;

public class SecondLargestElement {
    public static void main(String[] args) {
        int[] arr = {10, 20, 4, 45, 99}; // Example array
        if (arr.length < 2) {
            System.out.println("Array must have at least two elements.");
            return;
        }
        //
      //Sort the array in ascending order
        Arrays.sort(arr);

        // Find the second largest element
        int secondLargest = arr[arr.length - 2]; // Second largest is the second last element in sorted array

        System.out.println("The second largest element is: " + secondLargest);
    }
}
