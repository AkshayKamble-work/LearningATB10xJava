package CollectionFramework.List.List;

import java.util.Stack;

public class StackTest {
    public static void main(String[] args) {


        Stack s = new Stack();
        s.push("Chery");
        s.push("Banana");
        s.push("Apple");
        s.push("Mango");
        s.push("Banana");
        s.push(null);
        s.push(4);
        s.push("Cherryblack");
        System.out.println(s);
        System.out.println(s.containsAll(s));
        System.out.println(s.size());
        System.out.println(s);
        System.out.println(s.peek());
        System.out.println(s);
        System.out.println(s.pop());
        System.out.println(s);
        System.out.println(s.size());
        System.out.println(s.empty());
        System.out.println(s.add("Snehal"));
        System.out.println(s);
        System.out.println(s);
        s.add("Chetan");
        s.add("Chetan");
        s.push("Vijay");
        System.out.println(s);
        System.out.println(s.get(0));
        System.out.println(s.get(1));
    }
}