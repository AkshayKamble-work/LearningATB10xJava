package InterviewQuestions;

public class SmallandLargeElementArray
{
    public static void main(String[] args)
    {

        int arr[]={100,1,20,2,3,4,90,0};
        int max=arr[0];
        int min=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<min)
            {
                min=arr[i];
            }
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        System.out.println("Max element in Array is --> "+max);
        System.out.println("Min element in Array is --> "+min);
    }

}
