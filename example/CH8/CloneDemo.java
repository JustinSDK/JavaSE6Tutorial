public class CloneDemo {
    public static void main(String[] args) 
                         throws CloneNotSupportedException {
        Table table = new Table();
        table.setCenter(new Point(2, 3));
        Point originalCenter = table.getCenter();

        Table clonedTable = (Table) table.clone();
        Point clonedCenter = clonedTable.getCenter();

        System.out.printf("原來的Table中心：(%d, %d)\n", 
           originalCenter.getX(), originalCenter.getY());
        System.out.printf("複製的Table中心：(%d, %d)\n", 
           clonedCenter.getX(), clonedCenter.getY());

        clonedCenter.setX(10);
        clonedCenter.setY(10);

        // 改變複製品的內容，對原來的物件不會有影響
        System.out.printf("原來的Table中心：(%d, %d)\n", 
           originalCenter.getX(), originalCenter.getY());
        System.out.printf("複製的Table中心：(%d, %d)\n", 
           clonedCenter.getX(), clonedCenter.getY());
    }
}