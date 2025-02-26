package InterviewQuestions;

import java.util.HashMap;
import java.util.Map;

public class CharacterFrequency {
// input=Hello
// output=H1e1l@o1
    public static void main(String[] args) {

        String str = "hello world"; // Change this string to test with different inputs
        Map<Character, Integer> freqMap = new HashMap<>();

        for (char ch : str.toCharArray()) {
            if (ch != ' ') { // Ignoring spaces
                freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
            System.out.println("Character: " + entry.getKey() + " Frequency: " + entry.getValue());
        }
    }
}
