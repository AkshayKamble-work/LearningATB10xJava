package Java.Oops_Akshay.Collections;


import java.util.*;
import java.util.LinkedList;

public class QueueExample {
    public static void main(String[] args) {
        // Creating a Queue using LinkedList
        Queue<String> queue = new LinkedList<>();

        // Adding elements to the queue
        queue.add("Apple");
        queue.add("Banana");
        queue.add("Cherry");


        // Printing the queue
        System.out.println("Queue: " + queue);
        for (int i = 0; i <queue.size(); i++)
        {
            //System.out.println(queue);
        }
        // Checking the size of the queue
        System.out.println("Size of the queue: " + queue.size());

        // Peek: Retrieve but do not remove the head element
        System.out.println("Peek: " + queue.peek());

        // Remove an element from the queue
        System.out.println("Removed: " + queue.remove());

        // Poll: Retrieve and remove the head element
        System.out.println("Polled: " + queue.poll());

        // Printing the updated queue
        System.out.println("Queue after remove and poll: " + queue);

        // Checking if the queue is empty
        System.out.println("Is the queue empty? " + queue.isEmpty());

        // Clearing the queue
        queue.clear();
        System.out.println("Queue after clearing: " + queue);
    }
}


