package onlyfun.caterpillar;
 
import java.util.*;
 
public class TreeSetDemo2 {
    public static void main(String[] args) {
        // 自訂Comparator
        Comparator<String> comparator = 
                      new CustomComparator<String>();
        Set<String> set = 
                      new TreeSet<String>(comparator);
        
        set.add("justin");
        set.add("caterpillar");
        set.add("momor");
        
        // 使用 enhanced for loop 顯示物件
        for(String name : set) {
            System.out.print(name + " ");
        }
        System.out.println(); 
    }
}