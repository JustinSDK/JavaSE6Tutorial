public class OverloadTest {
    public static void main(String[] args) {
        someMethod(1);
    }
 
    public static void someMethod(int i) {
        System.out.println("int 版本被呼叫");
    }
 
    public static void someMethod(Integer integer) {
        System.out.println("Integer 版本被呼叫");
    }
}