package InterviewQuestions.ArraysQuestions;

import CollectionFramework.List.Arraylist;

import java.util.ArrayList;

public class CommonElementsTwoArray {
/*

input:    int[] arr1 = {1, 3, 4, 5, 2, 445, 22, 62};
        int[] arr2 = {5, 7, 22, 13, 62, 101, 2};

output: Common elements:
5 , 2 , 22 , 62 ,

 */
    public static void main(String[] args) {

        int[] arr1 = {1, 3, 4, 5, 2, 445, 22, 62};
        int[] arr2 = {5, 7, 22, 13, 62, 101, 2};

        ArrayList<Integer> common = new ArrayList<>();

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j] && !common.contains(arr1[i])) {
                    common.add(arr1[i]);
                }
            }
        }

        System.out.println("Common elements:");
        for (int num : common) {
            System.out.print(num + " , ");
        }
    }
}
