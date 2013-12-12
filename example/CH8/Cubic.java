public class Cubic extends Rectangle { 
    protected int z; 
    protected int length; 

    public Cubic() {
        super();
    } 

    public Cubic(int x, int y, int z, 
                 int length, int width, int height) { 
        super(x, y, width, height); 
        this.z = z; 
        this.length = length; 
    } 

    public void setZ(int z) { this.z = z; }
    public void setLength(int length) { this.length = length; }

    public int getZ() { return z; }
    public int getLength() { return length; } 

    public int getVolumn() { 
        // 可以直接使用父類別中的width、height成員
        return length*width*height; 
    } 
}