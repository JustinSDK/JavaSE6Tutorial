package onlyfun.caterpillar;
 
public class ClassInfoDemo {
    public static void main(String[] args) { 
        try {
            Class c = Class.forName(args[0]);
            Package p = c.getPackage();
            System.out.println(p.getName());
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("沒有指定類別");
        }
        catch(ClassNotFoundException e) {
            System.out.println("找不到指定類別");
        }
    }
}
 