package InterviewQuestions.ArraysQuestions;

public class MinValue {
    /*
    input : int arr[]={23,3,43,5,6,7,2};
    output : Smallest  number in the array: 2

     */
    public static void main(String[] args)
    {

        int arr[]={23,3,43,5,6,7,2};
        int minValue=arr[0];

        for (int i = 0; i <arr.length ; i++)
        {

            if (arr[i] <minValue)
            {
            minValue=arr[i];
            }
        }
        System.out.println(" Smallest  number in the array: " + minValue);

        MinValue();
    }
// Second Way
    public static  void MinValue()
    {
        int arr[]={1,23,3,43,5,6,7,2};
        int Smallvalue=arr[0];

        for(int num:arr)
        {
            if (num < Smallvalue)
            {
                Smallvalue=num;
            }
        }
        System.out.println(" Smallest  number in the array: " + Smallvalue);
    }


}
