package onlyfun.caterpillar;
 
import java.io.*;
 
public class ThreadGroupDemo2 {
    public static void main(String[] args) {
        // 建立例外處理者
        ThreadExceptionHandler handler = 
                 new ThreadExceptionHandler();
        ThreadGroup threadGroup1 = new ThreadGroup("group1");
        
        // 這是匿名類別寫法
        Thread thread1 = 
            // 這個執行緒是threadGroup1的一員
            new Thread(threadGroup1,
              new Runnable() {
                public void run() {
                    // 丟出unchecked例外
                    throw new RuntimeException("測試例外");
                }
            }); 

        // 設定例外處理者
        thread1.setUncaughtExceptionHandler(handler);     
        thread1.start();
    }
}