package onlyfun.caterpillar;
 
import java.util.*;
 
public class HashSetDemo {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();
        
        set.add("caterpillar");
        set.add("momor");
        set.add("bush");
        // 故意加入重覆的物件
        set.add("caterpillar");
        
        // 使用 Iterator 顯示物件
        Iterator iterator = set.iterator();
        while(iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }        
        System.out.println(); 

        set.remove("bush");
        // 使用 enhanced for loop 顯示物件
        for(String name : set) {
            System.out.print(name + " ");
        }
        System.out.println(); 
    }
}