package Java.logicalCoding;

public class MultiplecationTable
{
    public static void main(String[] args) {
        int number = 9; // Number for the multiplication table
      //  System.out.printf("Multiplication Table of %d:%n", number);
        System.out.printf("%d x 1 = %d%n", number, number * 1);
        System.out.printf("%d x 2 = %d%n", number, number * 2);
        System.out.printf("%d x 3 = %d%n", number, number * 3);
        System.out.printf("%d x 4 = %d%n", number, number * 4);
        System.out.printf("%d x 5 = %d%n", number, number * 5);
        System.out.printf("%d x 6 = %d%n", number, number * 6);
        System.out.printf("%d x 7 = %d%n", number, number * 7);
        System.out.printf("%d x 8 = %d%n", number, number * 8);
        System.out.printf("%d x 9 = %d%n", number, number * 9);
        System.out.printf("%d x 10 = %d%n", number, number * 10);

        // using For lopp
        System.out.println();
        int a=9;
        System.out.printf("Multiplication table of %d:%n",a);
        for (int i = 0; i <= 10; i++)
        {
            System.out.printf("%d x %d =%d%n",a,i,a*i);
        }
    }
}
