package InterviewQuestions.logicalCoding;

public class CleanString {

    public static void main(String[] args) {
        /*

Input :: D!i@w#a$l^i&1(- + < > ?
output:Letters and Spaces: Diwali
Special Characters: !@#$^&(-+<>?
Numbers: 1
         */


        String input = "D!i@w#a$l^i&100(- + < > ? ";
        String lettersAndSpaces = "";
        String specialChars = "";
        String numbers = "";

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z') || (ch == ' '))
            {
                lettersAndSpaces += ch;
            } else if (ch >= '0' && ch <= '9') {
                numbers += ch;
            } else {
                specialChars += ch;
            }
        }
        System.out.println("Input :: " + input);
        System.out.println("Letters and Spaces: " + lettersAndSpaces);
        System.out.println("Special Characters: " + specialChars);
        System.out.println("Numbers: " + numbers);
    }

}
