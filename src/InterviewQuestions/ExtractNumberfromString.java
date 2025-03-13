package InterviewQuestions;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractNumberfromString {

    public static void main(String[] args) {


        String i = "Java 123 is a Programming 456 Language.";
        // Compile the regex to match integers
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(i);
        // Extract integers
        List n = new ArrayList();
        while (matcher.find()) {
            n.add(Integer.parseInt(matcher.group()));
        }
        System.out.println("" + n);
    }
}
