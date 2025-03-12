package InterviewQuestions.logicalCoding;

public class RepeatedWords
{
    public static String CountWord(String str) {
        StringBuilder sb = new StringBuilder();
        int count = 1;

        for (int i = 1; i < str.length(); i++) {

            if (str.charAt(i) == str.charAt(i - 1)) {

                count++;
            } else {
                sb.append(str.charAt(i - 1)).append(count);
                count = 1;
            }
        }
        sb.append(str.charAt(str.length() - 1)).append(count);
        return sb.toString();


    }
    public static void main(String[] args)
    {
        String str = "AAAbbEEQQops";
        String Output=RepeatedWords.CountWord(str);
        System.out.println(Output);
    }
}
