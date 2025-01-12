package Java.Oops_Akshay.Collections;


import java.util.*;

public class VectorExample {
    public static void main(String[] args) {
        // 1. Create a Vector
        Vector<String> fruits = new Vector<>();

        // 2. Add elements to the Vector
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        System.out.println("Initial Vector: " + fruits);

        // 3. Add elements at specific index
        fruits.add(1, "Mango");
        System.out.println("After adding 'Mango' at index 1: " + fruits);

        // 4. Access elements
        String firstFruit = fruits.get(0);
        String secondFruit = fruits.get(1);
        System.out.println("First Fruit: " + firstFruit);
        System.out.println("Second Fruit: " + secondFruit);

        // 5. Update an element
        fruits.set(2, "Orange");
        System.out.println("After updating index 2 with 'Orange': " + fruits);

        // 6. Remove elements
        fruits.remove(3); // Removes "Cherry"
        fruits.remove("Banana"); // Removes "Banana"
        System.out.println("After removing elements: " + fruits);

        // 7. Check if the Vector contains an element
        boolean hasApple = fruits.contains("Apple");
        System.out.println("Contains 'Apple': " + hasApple);

        // 8. Get the size of the Vector
        int size = fruits.size();
        System.out.println("Size of the Vector: " + size);

        // 9. Iterate over the Vector
        System.out.println("Iterating over the Vector:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // 10. Check if the Vector is empty
        boolean isEmpty = fruits.isEmpty();
        System.out.println("Is the Vector empty? " + isEmpty);

        // 11. Clear the Vector
        fruits.clear();
        System.out.println("After clearing the Vector: " + fruits);

        // 12. Add all elements from another Vector
        Vector<String> newFruits = new Vector<>();
        newFruits.add("Pineapple");
        newFruits.add("Grapes");
        newFruits.add("Watermelon");

        fruits.addAll(newFruits);
        System.out.println("After adding all elements from newFruits: " + fruits);

        // 13. Capacity of the Vector
        int capacity = fruits.capacity();
        System.out.println("Capacity of the Vector: " + capacity);
    }
}


