package staticKeyword;
class StaticMethodHiding {

    static void show() {
        System.out.println("Parent static method");
    }
}
class subclass extends StaticMethodHiding

{
    static void show() {  // This does NOT override, it hides the parent method
        System.out.println("Child static method");
    }

    public static void main(String[] args) {
       StaticMethodHiding p = new StaticMethodHiding();
        p.show();  // Output: Parent static method

    subclass c = new subclass();
        c.show();  // Output: Child static method

StaticMethodHiding pc = new subclass();
        pc.show(); // Output: Parent static method (STATIC METHODS ARE NOT OVERRIDDEN!)
    }
}
