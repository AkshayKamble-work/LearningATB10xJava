package InterviewQuestions;

public class MoveZero {
    public static void main(String[] args) {

        int[] array = {0, 1, 0, 3, 12, 10, 4};
        moveZeroesToRight(array);

        for (int num : array) {
            System.out.print(num + " ");
        }
    }
    public static void moveZeroesToRight(int[] array) {
        int index = 0;

        // Move non-zero elements to the front
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                array[index] = array[i];
                index++;
            }
        }
        // Fill remaining elements with zero
        while (index < array.length) {
            array[index] = 0;
            index++;
        }
    }
}
