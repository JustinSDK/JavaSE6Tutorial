package onlyfun.caterpillar;
 
import java.util.*;
 
public class HashMapDemo2 {
    public static void main(String[] args) {
        Map<String, String> map = 
                  new HashMap<String, String>();
 
        map.put("justin", "justin 的訊息");
        map.put("momor", "momor 的訊息");
        map.put("caterpillar", "caterpillar 的訊息");
        
        Collection collection = map.values();
        Iterator iterator = collection.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println();

        // 事實上也可以使用增強的 for 迴圈
        for(String value : map.values()) {
            System.out.println(value);
        }
    }
}