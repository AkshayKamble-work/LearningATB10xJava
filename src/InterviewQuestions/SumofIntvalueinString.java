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


// Input directly in the code

// Second way 
        String input = "akshay 234";

        // Split the input into text and digits
        String[] parts = input.split(" ");
        String text = parts[0];
        String digits = parts[1];

        // Calculate sum of digits
        int sum = 0;
        for (char ch : digits.toCharArray()) {
            if (Character.isDigit(ch)) {
                sum += Character.getNumericValue(ch);
            }
        }

        // Output result
        System.out.println(text + sum)
    }


}
