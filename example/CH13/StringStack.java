package onlyfun.caterpillar;
 
import java.util.*;
 
public class StringStack {
    private LinkedList<String> linkedList;
    
    public StringStack() {
        linkedList = new LinkedList<String>();
    }
    
    public void push(String name) { 
        // 將元素加入串列前端
        linkedList.addFirst(name);
    }
    
    public String top() {
        // 取得串列第一個元素
        return linkedList.getFirst();
    }
    
    public String pop() {
        // 移出第一個元素
        return linkedList.removeFirst();
    }
 
    public boolean isEmpty() {
        // 串列是否為空
        return linkedList.isEmpty();
    }
}