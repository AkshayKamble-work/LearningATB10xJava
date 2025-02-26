package CollectionFramework.Map;

import java.util.HashMap;
import java.util.Map;

public class Map1 {

    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap();
        map.put(1,"Apple");
        map.put(2,"Apple");
        map.put(3,null);
        map.put(4,"123");
        map.put(5,null);


        System.out.println(map);
    }
}
