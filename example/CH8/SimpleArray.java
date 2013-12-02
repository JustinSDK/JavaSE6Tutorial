public class SimpleArray {
    protected int[] array;
 
    public SimpleArray(int i) {
        array = new int[i];
    }
 
    public void setElement(int i, int data) {
        array[i] = data;
    }
} 