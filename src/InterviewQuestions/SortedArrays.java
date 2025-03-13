package InterviewQuestions;

import java.util.Arrays;

public class SortedArrays {

    public static void main(String[] args) {
        int a[]={90,80,70,40,50,1,60,10,20,30,100,0};
        Arrays.sort(a);
        for (int i = 0; i <a.length ; i++)
        {

            System.out.print(a[i]+",");
        }
        //System.out.println(Arrays.toString(a));-->seconday Way
        System.out.println();
        String name[]={"Zebra", "Apple", "Mango", "Banana", "Cherry"};
        Arrays.sort(name);
        for (int i = 0; i <name.length ; i++)
        {
            System.out.print(name[i]+",");
        }
        //System.out.println(Arrays.toString(name));-->seconday Way
    }
}
