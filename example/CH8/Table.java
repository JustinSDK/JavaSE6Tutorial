public class Table implements Cloneable {
    private Point center;

    public void setCenter(Point center) {
        this.center = center;
    }
    public Point getCenter() {
        return center;
    }

    public Object clone () 
                     throws CloneNotSupportedException {
        // 呼叫父類的clone()來複製
        Table table = (Table) super.clone();

        if(this.center != null) {
            // 複製Point類型的資料成員
            table.center = (Point) center.clone(); 
        }
        
        return table; 
    }
}