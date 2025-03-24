package InterviewQuestions;

public class SquareDigitsFromString {
// String s="Automation555Testing";
    // output 25 25 25

    public static void main(String[] args)
    {
        String s="Automation987Testing";
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

// Addition of integers in string
       // input  "Automation884Testing"
        // output 20
        String name = "Automation884Testing";
int totalSum=0;
        // Loop through each character in the string
        for (char ch : name.toCharArray()) {
            // Check if the character is a digit
            if (Character.isDigit(ch)) {

                int digits = Character.getNumericValue(ch); // Convert char to int
                totalSum += digits; // Add to total sum
            }

        }
        System.out.println("Total sum of digits is: " + totalSum);

    }
}
