package InterviewQuestions;

public class MissingElementArray
{
    public static void main(String[] args) {
        int arr[] = {1, 2, 4, 5};
        int N = arr.length + 1; // Since one element is missing, array length + 1 gives the expected count

        int sumArr = 0;
        for (int i = 0; i < arr.length; i++) {
            sumArr += arr[i];
        }

        int expectedSum = N * (N + 1) / 2;
        int missingElement = expectedSum - sumArr;

        System.out.println("Missing Number: " + missingElement);
    }
}
