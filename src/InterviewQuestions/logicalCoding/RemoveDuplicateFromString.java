package InterviewQuestions.logicalCoding;

import java.util.LinkedHashSet;

public class RemoveDuplicateFromString {
    public static String Remove(String s)
    {
        LinkedHashSet<Character> set = new LinkedHashSet<>();
        StringBuilder result = new StringBuilder();

        // Add characters to LinkedHashSet to remove duplicates while maintaining order
        for (char ch : s.toCharArray())
        {
            if (set.add(ch)) {  // Add returns true if the character was not already in the set
                result.append(ch);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String input = "Hello";
        String output = Remove(input);
        System.out.println(output);
    }
}
