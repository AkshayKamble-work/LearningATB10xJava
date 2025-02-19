package InterviewQuestions;

import java.util.Arrays;

public class ArrayRotation {

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
       for(int i=1;i<=5;i++)
       {
           int k=arr[4];
           for(int j=arr.length-1;j>0;j--)
           {
               arr[j]=arr[j-1];
           }
           arr[0]=k;
           System.out.println(Arrays.toString(arr));
       }

    }

}
