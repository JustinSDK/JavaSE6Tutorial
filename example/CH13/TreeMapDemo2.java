package onlyfun.caterpillar;

import java.util.*;

public class TreeMapDemo2 {
    public static void main(String[] args) {
        CustomComparator<String> comparator = 
                new CustomComparator<String>();
        Map<String, String> map = 
                new TreeMap<String, String>(comparator);
        
        map.put("justin", "justin 的訊息");
        map.put("momor", "momor 的訊息");
        map.put("caterpillar", "caterpillar 的訊息");
        
        for(String value : map.values()) {
            System.out.println(value);    
        }
    }
}