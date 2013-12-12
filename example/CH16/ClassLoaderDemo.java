package onlyfun.caterpillar;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;

public class ClassLoaderDemo {
    public static void main(String[] args) {
        try {
            // 測試路徑
            String classPath = args[0];
            // 測試類別
            String className = args[1];

            URL url1 = new URL(classPath);
            // 建立ClassLoader
            ClassLoader loader1 = 
                      new URLClassLoader(new URL[] {url1});
            // 載入指定類別
            Class c1 = loader1.loadClass(className);
            // 顯示類別描述
            System.out.println(c1);
        
            URL url2 = new URL(classPath);
            ClassLoader loader2 = 
                      new URLClassLoader(new URL[] {url2});
            Class c2 = loader2.loadClass(className);
        
            System.out.println(c2);
        
            System.out.println("c1 與 c1 為同一實例？" 
                                     + (c1 == c2));
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("沒有指定類別載入路徑與名稱");
        }
        catch(MalformedURLException e) {
            System.out.println("載入路徑錯誤");
        }
        catch(ClassNotFoundException e) {
            System.out.println("找不到指定的類別");
        }
    }
}