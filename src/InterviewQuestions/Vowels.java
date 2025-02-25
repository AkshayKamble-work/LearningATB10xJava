package InterviewQuestions;

import Arrayss.Count;

public class Vowels {
    public static void main(String[] args) {
        String name="I love Tom & Jerry ";
        int Ccount=0;
        int Vcount=0;
        String str=name.toLowerCase();
        for(int i=0;i<name.length();i++)
        {

            char ch = str.charAt(i);
            if(ch=='a'||ch=='i'|ch=='e'||ch=='u'||ch=='o')
            {
                Vcount++;

            }
            else if(ch>='a'&& ch<='z')
            {
                Ccount++;
            }
        }
        System.out.println("Vowels --> "+Vcount);
        System.out.println("Consonants --> "+Ccount);
    }
}
