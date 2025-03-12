package InterviewQuestions.logicalCoding;

public class MoveZeroesToRight {
    public static void main(String[] args) {
        int[] array = {0, 1, 0, 3, 12,10,4};
        moveZeroesToRight(array);
        // Print the modified array
        for (int num : array) {
            System.out.print(num + " "); // Output: 1 3 12 0 0
        }
    }
    public static void moveZeroesToRight(int[] array) {
        int writeIndex = 0; // Tracks where the next non-zero element should go
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                // Swap non-zero element with the element at writeIndex
                int temp = array[writeIndex];
                array[writeIndex] = array[i];
                array[i] = temp;

                writeIndex++; // Move to the next position
            }
        }
    }
}
