package onlyfun.caterpillar;
 
public class ForNameDemo {
    public static void main(String[] args) { 
        try {
            Class c = Class.forName(args[0]);
            System.out.println("類別名稱：" + 
                          c.getName()); 
            System.out.println("是否為介面：" + 
                             c.isInterface()); 
            System.out.println("是否為基本型態：" + 
                             c.isPrimitive()); 
            System.out.println("是否為陣列：" + c.isArray()); 
            System.out.println("父類別：" + 
                             c.getSuperclass().getName());
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("沒有指定類別名稱");
        }
        catch(ClassNotFoundException e) {
            System.out.println("找不到指定的類別");
        }
    }
}