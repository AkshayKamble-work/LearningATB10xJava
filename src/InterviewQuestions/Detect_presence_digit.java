package InterviewQuestions;

public class Detect_presence_digit {

    public static void main(String[] args) {
// input int arr[]={1,2,0,32,43,92,42,22,72,89,99,19};
        // output 2 32 92 42 22 12
        int arr[]={1,2,0,32,43,92,42,22,12,89,99,19};


        System.out.println("Numbers containing digit '2':");
        for (int num : arr) {
            if (String.valueOf(num).contains("2"))
            {
                System.out.print(num + " ");
            }
        }
    }
}
