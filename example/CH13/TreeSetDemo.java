package onlyfun.caterpillar;
 
import java.util.*;
 
public class TreeSetDemo {
    public static void main(String[] args) {
        Set<String> set = new TreeSet<String>();
        
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