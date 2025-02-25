package InterviewQuestions;

public class SeprateString {

    public static void main(String[] args) {
        String input="i love the colours and pictures";
        String str[]=input.split(" ");
        System.out.println("Input --> "+input);
        for(int i =str.length-1;i>=0;i--)
        {
            System.out.print(str[i]+" ");
        }

    }
}
