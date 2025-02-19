package InterviewQuestions;

public class LargeAndSmallString
{
    public static void main(String[] args) {
         String name="Vision without action is a daydream";
         String word []=name.split(" ");
         String max=word[0];
         String min=word[0];
         for(int i=0;i<word.length;i++)
         {
             if(word[i].length()<min.length())
             {
                 min=word[i];
             }
             else if(word[i].length()>max.length())
             {
                 max=word[i];
             }
         }
        System.out.println("Small String is --> "+min);
        System.out.println("Large String is --> "+max);
    }

}
