package Java.Oops_Akshay.Collections;


import java.util.*;

public class SetMethodsExample {
    public static void main(String[] args) {
        // Create a HashSet
        HashSet<String> fruits = new HashSet<>();

        // Add elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        // Check if an element exists
        System.out.println("Contains Apple? " + fruits.contains("Apple"));  // true

        // Remove an element
        fruits.remove("Banana");

        // Size of the set
        System.out.println("Size of the set: " + fruits.size());  // 2

        // Check if set is empty
        System.out.println("Is set empty? " + fruits.isEmpty());  // false

        // Iterate over set
        System.out.println("Elements in the set:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Clear the set
        fruits.clear();
        System.out.println("Is the set empty after clearing? " + fruits.isEmpty());  // true
    }
}


