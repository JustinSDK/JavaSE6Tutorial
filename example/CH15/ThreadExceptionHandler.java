package onlyfun.caterpillar;
 
public class ThreadExceptionHandler 
          implements Thread.UncaughtExceptionHandler {
    public void uncaughtException(Thread t, Throwable e) {
        System.out.println(t.getName() + ": " 
                      + e.getMessage());
    }
}