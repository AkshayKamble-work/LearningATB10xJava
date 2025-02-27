package InterviewQuestions;

import Java.logicalCoding.RepeatedWords;

import java.util.HashSet;
// input= HELLO
// Output=HELO
public class RemoveDuplicates {

    public static String removeDuplicates(String s) {
        StringBuilder result = new StringBuilder();
        HashSet<Character> seen = new HashSet<>();

        for (char ch : s.toCharArray()) {
            if (!seen.contains(ch)) {
                seen.add(ch);
                result.append(ch);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String input = "Hello";
        System.out.println(removeDuplicates(input)); // Output: Helo

    }
}