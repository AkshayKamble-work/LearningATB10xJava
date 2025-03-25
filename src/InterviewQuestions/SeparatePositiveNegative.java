package InterviewQuestions;
import java.util.*;
public class SeparatePositiveNegative {

    public static void main(String[] args) {
        int[] numbers = {10, -5, 3, -8, 0, 15, -2, 7, -9};

        List<Integer> positiveNumbers = new ArrayList<>();
        List<Integer> negativeNumbers = new ArrayList<>();

        for (int num : numbers) {
            if (num >= 0) {
                positiveNumbers.add(num);
            } else {
                negativeNumbers.add(num);
            }
        }

        System.out.println("Positive Numbers: " + positiveNumbers);
        System.out.println("Negative Numbers: " + negativeNumbers);
    }
}
