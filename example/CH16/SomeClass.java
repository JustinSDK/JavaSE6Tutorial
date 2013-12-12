package onlyfun.caterpillar;

public class SomeClass {
    public static void main(String[] args) {
        // 建立SomeClass實例
        SomeClass some = new SomeClass();
        // 取得SomeClass的Class實例
        Class c = some.getClass();
        // 取得ClassLoader
        ClassLoader loader = c.getClassLoader();
        System.out.println(loader);
        // 取得父ClassLoader
        System.out.println(loader.getParent());
        // 再取得父ClassLoader
        System.out.println(loader.getParent().getParent());
    }
}