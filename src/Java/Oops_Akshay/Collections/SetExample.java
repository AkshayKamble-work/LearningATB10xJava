package Java.Oops_Akshay.Collections;


import java.util.*;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetExample {
    public static void main(String[] args) {
        // 1. HashSet Example
        System.out.println("HashSet Example:");
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Cherry");
        hashSet.add("Apple"); // Duplicate element
        System.out.println("HashSet: " + hashSet); // Notice no duplicates and no order

        // 2. LinkedHashSet Example
        System.out.println("\nLinkedHashSet Example:");
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Apple");
        linkedHashSet.add("Banana");
        linkedHashSet.add("Cherry");
        linkedHashSet.add("Apple"); // Duplicate element
        System.out.println("LinkedHashSet: " + linkedHashSet); // Maintains insertion order

        // 3. TreeSet Example
        System.out.println("\nTreeSet Example:");
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Apple");
        treeSet.add("Banana");
        treeSet.add("Cherry");
        treeSet.add("Apple"); // Duplicate element
        System.out.println("TreeSet: " + treeSet); // Sorted order (natural ordering)

        // Common Set Methods
        System.out.println("\nCommon Set Methods:");

        // Add Elements
        treeSet.add("Mango");
        System.out.println("After adding 'Mango': " + treeSet);

        // Remove Element
        treeSet.remove("Banana");
        System.out.println("After removing 'Banana': " + treeSet);

        // Check if Set contains an Element
        boolean containsCherry = treeSet.contains("Cherry");
        System.out.println("Contains 'Cherry': " + containsCherry);

        // Get the Size of the Set
        System.out.println("Size of the TreeSet: " + treeSet.size());

        // Iterate over the Set
        System.out.println("Iterating over TreeSet:");
        for (String fruit : treeSet) {
            System.out.println(fruit);
        }

        // Clear the Set
        treeSet.clear();
        System.out.println("After clearing the TreeSet: " + treeSet);

        // Check if Set is Empty
        boolean isEmpty = treeSet.isEmpty();
        System.out.println("Is the TreeSet empty? " + isEmpty);
    }
}


