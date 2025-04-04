package InterviewQuestions.ArraysQuestions;
/*
input:  int arr[] = {2, 3, 4, 5, 10};
output:
Count of Even Numbers >> 3
Count of ODD Numbers >> 2

 */
public class CountOfEven_Odd {
    public static void main(String[] args) {
        int arr[] = {2, 3, 4, 5, 10};
        int CountOFEven = 0;
        int CountOfODD = 0;
        for (int i = 0; i < arr.length; i++) {

            if (i % 2 == 0) {
                CountOFEven++;
            } else {
           CountOfODD++;
            }
        }
        System.out.println("Count of Even Numbers >> "+CountOFEven);
        System.out.println("Count of ODD Numbers >> "+CountOfODD);
    }
}
