package Java.logicalCoding;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SmallestAndLargestString
{

    public static void main(String[] args)
    {
        String sentence = "Vision without action is a daydream";
        String[] words = sentence.split(" ");

        String smallest = words[0];
        String largest = words[0];

        for (int i = 1; i < words.length; i++)
        {
            if (words[i].length() < smallest.length())
            {
                smallest = words[i];
            }
            if (words[i].length() > largest.length())
            {
                largest = words[i];
            }
        }

        System.out.println("Smallest Word: " + smallest);
        System.out.println("Largest Word: " + largest);
    }
}
