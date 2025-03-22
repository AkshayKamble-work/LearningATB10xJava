package InterviewQuestions;

public class SwappingString {

    public static void main(String[] args) {
        String a = "Apple";
        String b = "Banana";
        String temp;
        System.out.println("Using 3rd varrible");
        System.out.println();
        System.out.println("Before Swapping");
        System.out.println(a);
        System.out.println(b);
        temp = a;// Using 3rd varrible
        a = b;
        b = temp;
        System.out.println("After Swapping");
        System.out.println(a);
        System.out.println(b);
        System.out.println();
        // without 3rd varrible
        System.out.println("without 3rd varrible");
        String c = "Akshay";
        String d = "Kamble";
        System.out.println("Before Swapping");
        System.out.println(c);
        System.out.println(d);
        c = c + d;
        d = c.substring(0, c.length() - d.length());
        c = c.substring(d.length());
        System.out.println();
        System.out.println("After Swapping");
        System.out.println(c);
        System.out.println(d);

    }
}
