package CollectionFramework.List.List;

import java.util.Enumeration;
import java.util.List;
import java.util.Vector;

public class VectorTest {


    public static void main(String[] args) {

        Vector myvector = new Vector();
        myvector.add("Black");
        myvector.add("White");
        myvector.add("Blue");
        myvector.add("Green");
        myvector.add("Gray");
        myvector.add("Yellow");
        myvector.add("Darkblue");
        myvector.add(null);
        myvector.add("Gray");

        System.out.println(myvector);
        System.out.println("Size of linked list --> "+myvector.size());
        System.out.println("Index of Draganfruit element is --> "+myvector.indexOf("Yellow"));
        System.out.println("Linked list is empty --> "+myvector.isEmpty());
        System.out.println(myvector.contains(5));
        System.out.println(myvector.remove(null));
        System.out.println(myvector);
        System.out.println(myvector.getLast());
        System.out.println(myvector.getFirst());
        System.out.println(myvector.set(5,"Blackcherry"));
        System.out.println(myvector);

        for (int i = 0; i <myvector.size() ; i++)
        {
            System.out.println(myvector.get(i));
        }


    }
}
