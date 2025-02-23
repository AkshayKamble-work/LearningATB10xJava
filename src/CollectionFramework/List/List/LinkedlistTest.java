package CollectionFramework.List.List;

import java.util.LinkedList;
import java.util.List;

public class LinkedlistTest
{

    public static void main(String[] args) {

        List mylist=new LinkedList();
        mylist.add("Banana");
        mylist.add("Apple");
        mylist.add("Cheery");
        mylist.add(null);
        mylist.add("Draganfruit");
        mylist.add("Apple");
        mylist.add(null);
        mylist.add(5);
        mylist.add("Cheery");
        System.out.println(mylist);
        System.out.println("Size of linked list --> "+mylist.size());
        System.out.println("Index of Draganfruit element is --> "+mylist.indexOf("Draganfruit"));
        System.out.println("Linked list is empty --> "+mylist.isEmpty());
        System.out.println(mylist.contains(5));
        System.out.println(mylist.remove(null));
        System.out.println(mylist);
        System.out.println(mylist.getLast());
        System.out.println(mylist.getFirst());
        System.out.println(mylist.set(5,"Blackcherry"));
        System.out.println(mylist);

    }
}
