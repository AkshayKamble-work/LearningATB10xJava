package InterviewQuestions;

public class ReverseString {
    public static void main(String[] args) {
        String name="I love india";
        System.out.println("Reverse String ");
        String output="";
        for(int i=name.length()-1;i>=0;i--)
        {
            output=output+name.charAt(i);
        }
        System.out.println("Input --> "+name);
        System.out.println("Output --> "+output);
    }
}
