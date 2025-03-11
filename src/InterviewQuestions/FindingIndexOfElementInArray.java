package InterviewQuestions;
import java.util.*;
public class FindingIndexOfElementInArray

{
// Enter the element to search: 3
//Element found at indices: [1,2]
    public static void main(String[] args) {
        int[] givenArray = {1, 3, 3, 4, 5, 6, 6, 7, 8, 9, 9};
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the element to search: ");
        int targetElement = scanner.nextInt();
        scanner.close();

        ArrayList<Integer> indices = new ArrayList<>();
        for (int i = 0; i < givenArray.length; i++) {
            if (givenArray[i] == targetElement) {
                indices.add(i);
            }
        }

        if (indices.isEmpty()) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at indices: " + indices);
        }
    }
}
