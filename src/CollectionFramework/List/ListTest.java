package CollectionFramework.List;

import java.util.ArrayList;
import java.util.List;

public class ListTest {

    public static void main(String[] args) {
        List mylist = new ArrayList();
        mylist.add("banana");
        mylist.add("Chery");
        mylist.add("DraganFruit");
        mylist.add("");// Null are allowed
        mylist.add("2");
        mylist.add("Cherry");// Duplicate are allow


        System.out.println(mylist);
    }
}
