package Task09Feb;

public class InvertedPryamid {
    public static void main(String[] args) {

        int n = 5;
        for (int i = n; i >= 1; i--) {
            System.out.print(" ".repeat(n - i));
            System.out.println("*".repeat(2 * i - 1));
        }
    }
}
