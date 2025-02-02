package Java.basic.casting;

public class Casting {
    public static void main(String[] args) {

        System.out.println("TYPE CASTING");
        //What is Type casting ?
        //Typecasting means converting one data type into another data type
        //Types are -
        System.out.println("Narrowing");
        // 1) Narrowing (Implicit, by JVM, automatically)
        // >conversion of smaller data type into larger data type
        // >no explicit notation is required and no data loss.
        // double >> float >> long >> int >> char >> short >> byte
        byte x = 5;
        int y = x;
        long z = y;
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println();

        System.out.println("Widening");
        // 2) Widening (Explicit, by user, manually)
        // >conversion of larger data type into smaller data type
        // >requires explicit notation and risk of data loss exists
        // byte >> short >> char >> int >> long >> float >> double
        float a = 100.65f;
        long b = (long)a;
        int c = (int)b;
        byte d = (byte)c;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);


    }
}
