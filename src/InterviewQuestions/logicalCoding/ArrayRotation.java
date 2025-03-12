package InterviewQuestions.logicalCoding;

import java.util.Arrays;

public class ArrayRotation {
    /*
    input=[1, 2, 3, 4, 5, 6, 7]
    output=[7, 1, 2, 3, 4, 5, 6]
           [6, 7, 1, 2, 3, 4, 5]
           [5, 6, 7, 1, 2, 3, 4]
        */
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7};

        for (int j = 1; j <= 3; j++) { // Rotate 3 times
            int k = arr[6]; // Store the last element
            for (int i = arr.length - 1; i > 0; i--) {
                arr[i] = arr[i - 1]; // Shift elements to the right
            }
            arr[0] = k; // Place the last element at the first position
            System.out.println(Arrays.toString(arr)); // Print the array after each rotation

        }
    }
}
