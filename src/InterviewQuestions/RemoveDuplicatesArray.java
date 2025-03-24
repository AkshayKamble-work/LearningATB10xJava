package InterviewQuestions;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesArray {
//output: After removing duplicates:1 2 3 4 5
    //input:,1,2,3,4,5,1,2,3,4
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 1, 5,2,3,4};

        Set<Integer> set = new LinkedHashSet<>();

        // Adding elements to LinkedHashSet (automatically removes duplicates & keeps order)
        for (int num : arr) {
            set.add(num);
        }

        // Printing the result
        System.out.println("After removing duplicates:");
        for (int num : set) {
            System.out.print(num + " ");
        }
    }
}
