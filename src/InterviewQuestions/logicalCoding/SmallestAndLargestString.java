package InterviewQuestions.logicalCoding;

public class SmallestAndLargestString {
/*Input=Vision without action is a day dream
output= smallest String is "a"
largest String is "without"
 */
    public static void main(String[] args)

    {
        String sentence = "Vision without action is a day dream";
        String[] words = sentence.split(" ");
        String min = words[0];
        String max = words[0];
        for (int i = 1; i < words.length; i++)
        {
            if (words[i].length() < min.length())
            {
                min = words[i];
            }
            if (words[i].length() > max.length())
            {
                max = words[i];
            }

        }
        System.out.println("Smallest String is : " + min);
        System.out.println("Largest String is : " + max);


    }
    }

