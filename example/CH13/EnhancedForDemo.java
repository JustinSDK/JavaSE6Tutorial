package onlyfun.caterpillar;
 
import java.util.*;
 
public class EnhancedForDemo {
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
        
        // 使用foreach來遍訪List中的元素
        for(String s : list) {
            System.out.print(s + " ");
        }
        
        System.out.println(); 
    }
}