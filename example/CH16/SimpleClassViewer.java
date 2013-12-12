package onlyfun.caterpillar;

import java.lang.reflect.*;

public class SimpleClassViewer {
     public static void main(String[] args) { 
        try {
            Class c = Class.forName(args[0]);
            // 取得套件代表物件
            Package p = c.getPackage();
            
            System.out.printf("package %s;%n", p.getName());
            
            // 取得型態修飾，像是class、interface
            int m = c.getModifiers();
            
            System.out.print(Modifier.toString(m) + " ");
            // 如果是介面
            if(Modifier.isInterface(m)) {
                System.out.print("interface ");
            }
            else {
                System.out.print("class ");
            }
            
            System.out.println(c.getName() + " {");

            // 取得宣告的資料成員代表物件
            Field[] fields = c.getDeclaredFields();
            for(Field field : fields) {
                // 顯示權限修飾，像是public、protected、private
                System.out.print("\t" + 
                    Modifier.toString(field.getModifiers()));
                // 顯示型態名稱
                System.out.print(" " + 
                    field.getType().getName() + " ");
                // 顯示資料成員名稱
                System.out.println(field.getName() + ";");
            }

            // 取得宣告的建構方法代表物件            
            Constructor[] constructors = 
                            c.getDeclaredConstructors();
            for(Constructor constructor : constructors) {
                // 顯示權限修飾，像是public、protected、private
                System.out.print("\t" + 
                     Modifier.toString(
                       constructor.getModifiers()));
                // 顯示建構方法名稱
                System.out.println(" " + 
                      constructor.getName() + "();");
            }
            // 取得宣告的方法成員代表物件             
            Method[] methods = c.getDeclaredMethods();
            for(Method method : methods) {
                // 顯示權限修飾，像是public、protected、private
                System.out.print("\t" + 
                     Modifier.toString(
                              method.getModifiers()));
                // 顯示返回值型態名稱
                System.out.print(" " + 
                     method.getReturnType().getName() + " ");
                // 顯示方法名稱
                System.out.println(method.getName() + "();");
            }
            System.out.println("}");
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("沒有指定類別");
        }
        catch(ClassNotFoundException e) {
            System.out.println("找不到指定類別");
        }
    }
}