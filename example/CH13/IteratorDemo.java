package onlyfun.caterpillar;
 
import java.util.*;
 
public class IteratorDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        List<String> list = new ArrayList<String>();
        
        System.out.println("輸入名稱(輸入quit結束)"); 
        while(true) { 
            System.out.print("# "); 
            String input = scanner.next(); 
 
            if(input.equals("quit"))
                 break; 
            list.add(input); 
        }

        // 使用 Iterator 取得元素
        Iterator iterator = list.iterator();        
        while(iterator.hasNext()) { // 還有下一個元素嗎？
            // 使用 next() 取得下一個元素
            System.out.print(iterator.next() + " ");
        }
        
        System.out.println(); 
    }
}