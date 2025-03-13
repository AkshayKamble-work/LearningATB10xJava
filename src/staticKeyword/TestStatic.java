package staticKeyword;

import kotlin.text.UStringsKt;
class Test {
    static String dryfruit = "Kazu";
    static int amount = 1;
}

public class TestStatic extends Test {

    // Static variables cannot be reassigned outside of a static block or method
    // Removed direct assignments here

    static int price = 10;
    static String fruit = "Apple";
    public static void main(String[] args) {
        fruit = "Mango";

        // Corrected spelling of variable names
        System.out.println(TestStatic.price);
        System.out.println(TestStatic.fruit);
        System.out.println(TestStatic.dryfruit);
        System.out.println(TestStatic.amount); // Fixed spelling mistake

    }
}
