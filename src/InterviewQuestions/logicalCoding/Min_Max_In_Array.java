package InterviewQuestions.logicalCoding;

public class Min_Max_In_Array {
    public static void main(String[] args) {
        int[] a = {100, 20, 99, 5,12,10};
        int max = a[0];
        int min = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
            if (a[i] < min) {
                min = a[i];
            }
        }
        System.out.println("Max value is :: " + max);

        System.out.println("Min value :: " + min);
    }
}
