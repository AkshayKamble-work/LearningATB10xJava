package InterviewQuestions.ArraysQuestions;

public class DuplicateElement {
/*

input:  int arr[]={1,2,3,4,5,6,7,8,9,1,2,3};
output : Duplicate elements >> 123
 */
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9,1,2};
        System.out.print("Duplicate elements >> ");
        for (int i = 0; i < arr.length ; i++)
        {

            for (int j =i+1; j < arr.length ; j++)
            {

                if (arr[i] == arr[j])
                {
                    System.out.print(arr[j]+",");
                }
            }
        }
    }
}
