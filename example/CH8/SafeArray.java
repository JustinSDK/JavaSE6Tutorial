public class SafeArray extends SimpleArray {
    public SafeArray(int i) {
        super(i);
    }
 
    public void setElement(int i, int data) {
        if(i < array.length)
            super.setElement(i, data);
    }
}