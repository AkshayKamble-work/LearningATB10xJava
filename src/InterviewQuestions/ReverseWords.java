package InterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class ReverseWords {
    public static void main(String[] args) {
//input-> ym NAME si AKSHAY elbmak
// output-> my Name is Akshay kamble
        String s = "my Name is Akshay kamble";
        List<String> words = new ArrayList<>(Arrays.asList(s.split(" ")));
        words.replaceAll(Myword -> Myword.matches("[a-z]+") ?
                new StringBuilder(Myword).reverse().toString() : Myword.toUpperCase());
        System.out.println(String.join(" ", words));
    }
}
