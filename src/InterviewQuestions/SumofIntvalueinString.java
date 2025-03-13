package InterviewQuestions;

public class SumofIntvalueinString {

    public static void main(String[] args) {
        // second way
        String str = "GeeksforGeeks password is : 123456789";

        int digits = 0;
        for (int i = 0; i < str.length(); i++)
        {
            if (Character.isDigit(str.charAt(i)))
                digits++;
        }
        System.out.println("Total number of Digits = "+ digits); // output 9
    }
}
