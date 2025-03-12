package InterviewQuestions.logicalCoding;

public class ReverString
{
    public static void main(String[] args) {

        String s="i love india";
        StringBuilder sb=new StringBuilder(s);
        String Result=sb.reverse().toString();
        System.out.println(Result);
    }
}
