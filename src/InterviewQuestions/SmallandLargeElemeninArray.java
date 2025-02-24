package InterviewQuestions;

public class SmallandLargeElemeninArray
{

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,66,7,8,9};
        int max=arr[0];
        int min=arr[0];
        for(int i=0;i< arr.length;i++)
        {
            if(max<arr[i])
            {
                max=arr[i];
            }
            else if(min>arr[i])
            {
            min=arr[i];
            }
        }
        System.out.println("Small element in Array is --> "+min);
        System.out.println("Larges element in Array is --> "+max);
    }
}
