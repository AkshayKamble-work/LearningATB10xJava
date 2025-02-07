package Task09Feb;

public class Pyramid {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            System.out.print(" ".repeat(n-i));
            System.out.println("*".repeat(2*i-1));
        }
    }
}
