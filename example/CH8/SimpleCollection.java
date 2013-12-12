public class SimpleCollection { 
    private Object[] objArr; 
    private int index = 0; 
 
    public SimpleCollection() { 
        // 預設10個物件空間 
        objArr = new Object[10]; 
    } 
 
    public SimpleCollection(int capacity) { 
        objArr = new Object[capacity]; 
    } 
 
    public void add(Object o) { 
        objArr[index] = o; 
        index++; 
    } 
 
    public int getLength() { 
        return index; 
    } 
 
    public Object get(int i) { 
        return objArr[i]; 
    } 
}