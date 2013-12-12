package onlyfun.caterpillar;
 
public class ClassDemo {
    public static void main(String[] args) {
        String name = "caterpillar";
        Class stringClass = name.getClass();
        System.out.println("類別名稱：" + 
                    stringClass.getName()); 
        System.out.println("是否為介面：" + 
                    stringClass.isInterface()); 
        System.out.println("是否為基本型態：" + 
                    stringClass.isPrimitive()); 
        System.out.println("是否為陣列物件：" + 
                    stringClass.isArray()); 
        System.out.println("父類別名稱：" + 
                    stringClass.getSuperclass().getName());
    }
}