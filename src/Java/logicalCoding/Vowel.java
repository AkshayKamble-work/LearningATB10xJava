package Java.logicalCoding;

public class Vowel
{
    public static void main(String[] args) {

        int Vcount=0; int Ccount=0;
        String str="I love Tom & Jerry";
        str=str.toLowerCase();
        for (int i = 0; i <str.length() ; i++)
        {

            if (str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
            {
                Vcount++;
            }
            else if(str.charAt(i)>='a'&& str.charAt(i)<='z')
            {
                Ccount++;
            }
        }
        System.out.println("Number of vowels: " + Vcount);
        System.out.println("Number of consonants: " + Ccount);
    }
}
