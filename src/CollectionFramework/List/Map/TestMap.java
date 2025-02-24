package CollectionFramework.List.Map;

import java.util.HashMap;
import java.util.Map;

public class TestMap
{
    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap();
        map.put(1, "Apple");// insertion order are mantained
        map.put(2, "Banana");
        map.put(3, "Cherry");
        map.put(4,"Watermelon");
        map.put(9,null);// Null are alllowed
        map.put(5,"Chikhu");
        map.put(6,"Blackberry");
        map.put(7,"Apple");// Duplicate are allowed
        map.put(8,null);
        System.out.println(map);
        System.out.println("------");
        for (Map.Entry<Integer,String> MapElemet:map.entrySet())
        {
            System.out.println(MapElemet.getKey()+" "+MapElemet.getValue());
        }

    }
}
