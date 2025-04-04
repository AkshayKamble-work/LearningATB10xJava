package InterviewQuestions.ArraysQuestions;

public class SumofOddEveninArray {
/*

input : int arr[]={2,3,4,5,10};

Sum of Even Numbers >> 16
Sum of Odd Numbers >> 8
 */
    public static void main(String[] args) {

        int arr[]={2,3,4,5,10};

        int sumOfOdd=0;
        int sumofEven=0;
        for (int i = 0; i <arr.length ; i++)
        {

            if (arr[i]%2 == 0)
            {

                sumofEven=sumofEven+arr[i];
            }
            else {
                sumOfOdd=sumOfOdd+arr[i];
            }
        }
        System.out.println("Sum of Even Numbers >> "+sumofEven);
        System.out.println("Sum of Odd Numbers >> "+sumOfOdd);
    }
}
