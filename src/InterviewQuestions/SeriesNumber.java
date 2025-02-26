package InterviewQuestions;
import java.util.*;
public class SeriesNumber {

    public static void main(String[] args) {
        int a = -1;
        int b = 1;
        int c;
        System.out.print("Series number is --> ");
        for (int i = 0; i <= 10; i++) {
            c = a + b;
            a = b;
            b = c;
            System.out.print(c + " ,");
        }
        System.out.println();
        System.out.println("---Swapping Number---");
        int A=10;
        int B=20;
        System.out.println("---Before Swapping---");
        System.out.println("Value of A "+A);
        System.out.println("Value of B "+B);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("---After Swapping---");
        System.out.println("Value of A "+A);
        System.out.println("Value of B "+B);
    }
}
