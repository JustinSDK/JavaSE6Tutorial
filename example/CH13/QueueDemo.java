package onlyfun.caterpillar;

import java.util.*;

public class QueueDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue<String> queue = new LinkedList<String>();
        
        System.out.println("輸入名稱(使用quit結束)"); 

        while(true) { 
            System.out.print("# "); 
            String input = scanner.next(); 
 
            if(input.equals("quit"))
                 break; 
            // offer()：加入元素至佇列中
            queue.offer(input); 
        }
        
        System.out.print("顯示輸入: ");
        String element = null;
        // poll()：取得並移去佇列中的元素
        while((element = queue.poll()) != null) {
            System.out.print(element + " ");
        }
        System.out.println();     
    }
}