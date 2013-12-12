package onlyfun.caterpillar;

public class SomethingDemo {
    public static void main(String[] args) {
        Something some = new Something();
        // 呼叫被@Deprecated標示的方法
        some.getSomething();
    }
}