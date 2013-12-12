package onlyfun.caterpillar;
 
import java.util.*;
 
public class LinkedHashSetDemo {
    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<String>();
        
        set.add("caterpillar");
        set.add("momor");
        set.add("bush");
        
       // 使用 enhanced for loop 顯示物件
        for(String name : set) {
            System.out.print(name + " ");
        }
        System.out.println(); 
    }
}