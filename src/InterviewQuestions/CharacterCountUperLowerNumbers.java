package InterviewQuestions;

public class CharacterCountUperLowerNumbers {
/*


Input ---> Hello123@#2025!WORLD
Output->
Total letters --> 10
Totoal upper case --> 6
Total lower case --> 4
Total special Characters. --> 3
Total numbers --> 7

    */
    public static void main(String[] args) {

        String s="Hello123@#2025!WORLD";
        int uppercase=0;
        int lowercase=0;
        int numbers=0;
        int specialCharacters=0;

        for (int i = 0; i <s.length() ; i++)
        {

            char ch=s.charAt(i);

            if (Character.isUpperCase(ch))
            {
            uppercase++;
            }
            else if(Character.isLowerCase(ch))
            {
                lowercase++;
            }
            else if(Character.isDigit(ch))
            {
                numbers++;
            }
            else {
                specialCharacters++;
            }
        }
        int totalletters=uppercase+lowercase;
        System.out.println("Input ---> "+s);
        System.out.println("Total letters --> "+totalletters);
        System.out.println("Totoal upper case --> "+uppercase);
        System.out.println("Total lower case --> "+lowercase);
        System.out.println("Total special Characters. --> "+specialCharacters);
        System.out.println("Total numbers --> "+numbers);
    }
}
