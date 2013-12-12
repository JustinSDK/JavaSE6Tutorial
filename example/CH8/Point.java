public class Point implements Cloneable {
    private int x;
    private int y;

    public Point() {}
    public Point(int x, int y) { 
        this.x = x; 
        this.y = y;
    }

    public void setX(int x) { this.x = x; }
    public void setY(int y) { this.y = y; }

    public int getX() { return x; }
    public int getY() { return y; }    

    public Object clone() throws CloneNotSupportedException {
        // 呼叫父類別的clone()來進行複製
        return super.clone(); 
    }   
}