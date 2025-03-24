package InterviewQuestions;

public class SquareDigitsFromString {
// String s="Automation555Testing";
    // output 25 25 25

    public static void main(String[] args)
    {
        String s="Automation555Testing";
        int digit;
        for(char ch:s.toCharArray())
        {
            if(Character.isDigit(ch))
            {
                 digit = Character.getNumericValue(ch); // Convert char to int
                int square = digit * digit; // Compute square
                System.out.println("Square of " + digit + " is: " + square);
            }
        }
    }
}
