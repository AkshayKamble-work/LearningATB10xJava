package InterviewQuestions.ArraysQuestions;

public class SumOfArray {
/*

input : int arr[]={1,2,3,4,1,4,4};
output:  Sum of array elements >> 19

 */
    public static void main(String[] args) {
        int arr[]={1,2,3,4,1,4,4};
        int sum=0;
        for (int i = 0; i <arr.length ; i++)
        {

            sum=sum+arr[i];
        }
        System.out.println("Sum of array elements >> "+sum);
    }
}
