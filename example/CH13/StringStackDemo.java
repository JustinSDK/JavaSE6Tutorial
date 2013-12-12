package onlyfun.caterpillar;

import java.util.Scanner;

public class StringStackDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         
        StringStack stack = new StringStack();
        
        System.out.println("輸入名稱(使用quit結束)"); 

        while(true) { 
            System.out.print("# "); 
            String input = scanner.next(); 
 
            if(input.equals("quit"))
                 break; 
            stack.push(input); 
        }
        
        System.out.print("顯示輸入: ");
        while(!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
        System.out.println();     
    }
}