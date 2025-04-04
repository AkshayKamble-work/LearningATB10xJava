package InterviewQuestions.ArraysQuestions;

public class MaxvalueInarray {
/*
input: int[] arr = {1, 3, 4, 5, 2, 445, 22, 62};
output: Largest number in the array: 445
 */
    public static void main(String[] args)
    {

        int[] arr = {1, 3, 4, 5, 2, 445, 22, 62};

        int max = arr[0]; // Assume first element is the largest

        for (int num : arr) {
            if (num > max) {
                max = num; // Update max if a larger number is found
            }
        }

        System.out.println("Largest number in the array: " + max);
MaxvalueInarray.MaxvalueInarray();
    }

// Second Way
    public static void MaxvalueInarray()
    {
        int arr[]={1, 3, 4, 5, 2, 44, 22, 62};
        int max=arr[0];

        for (int i = 0; i <arr.length ; i++)
        {

            if (arr[i] > max)
            {
            max=arr[i];
            }
        }
        System.out.println("Largest number in the array: " + max);
    }
}
