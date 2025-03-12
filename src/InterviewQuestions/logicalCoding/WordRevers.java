package InterviewQuestions.logicalCoding;

public class WordRevers
{
    public static void main(String[] args)
    {
       // System.out.println("Please enter input..");
      //  Scanner sc=new Scanner(System.in);
       // String input=sc.nextLine();
        String input="I am akshay kamble";
        System.out.println("Input "+input);
        String words[]=input.split(" ");
        for(int i =words.length-1;i>=0;i--)
        {
            System.out.print(words[i]+" ");
        }
    }
}
