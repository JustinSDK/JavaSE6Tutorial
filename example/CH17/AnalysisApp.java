package onlyfun.caterpillar;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class AnalysisApp {
    public static void main(String[] args) 
                               throws NoSuchMethodException {
        Class<SomeClass3> c = SomeClass3.class;

        // 因為SomeAnnotation標示於doSomething()方法上
        // 所以要取得doSomething()方法的Method實例
        Method method = c.getMethod("doSomething");

        // 如果SomeAnnotation存在的話
        if(method.isAnnotationPresent(SomeAnnotation.class)) {
            System.out.println("找到 @SomeAnnotation");
            // 取得SomeAnnotation
            SomeAnnotation annotation = 
                 method.getAnnotation(SomeAnnotation.class);
            // 取得value成員值
            System.out.println("\tvalue = " + annotation.value());
            // 取得name成員值
            System.out.println("\tname = " + annotation.name());
        }
        else {
            System.out.println("找不到 @SomeAnnotation");
        }

        // 取得doSomething()方法上所有的Annotation
        Annotation[] annotations = method.getAnnotations();
        // 顯示Annotation名稱
        for(Annotation annotation : annotations) {
            System.out.println("Annotation名稱：" +
                    annotation.annotationType().getName());
        }
    }
 }