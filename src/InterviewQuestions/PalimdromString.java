package InterviewQuestions;

public class PalimdromString
{
    public static void main(String[] args) {
        String input="mom";
        String output="";
        for(int i=input.length()-1;i>=0;i--)
        {
            output=output+input.charAt(i);
        }
        if(input.equals(output))
        {
            System.out.println(output+" String is palimdrom");

        }
        else
        {
            System.out.println(output+" String is not palimdrom");
        }
    }
}
