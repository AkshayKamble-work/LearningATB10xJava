package CollectionFramework.List.Set;
import java.util.*;
public class HashSetTest
{
    public static void main(String[] args) {
        HashSet <String>set = new HashSet();
        set.add("Orange");
        set.add(null); // Only one null are allowed
        set.add("Apple");
        set.add("Banana");
        set.add("Apple");
        set.add(null);
        System.out.println("Has Set elements --> "+set);
    }
}
