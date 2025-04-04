package InterviewQuestions.ArraysQuestions;

public class SquareArray {
/*
input: int arr[] = {1, 2, 3, 4, 5, 6};
output:
1 squared = 1
2 squared = 4
3 squared = 9
4 squared = 16
5 squared = 25
6 squared = 36

 */
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6};
        int squre = 0;

        for (int i = 0; i < arr.length; i++) {
            squre = arr[i] * arr[i];
            System.out.println(arr[i] + " squared = " + squre);
        }


    }
}
