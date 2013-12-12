package onlyfun.caterpillar;

import java.io.*;
import java.util.logging.*;                            
 
public class SimpleThreadLogger {
    private static final 
        java.lang.ThreadLocal<Logger> threadLocal = 
                  new java.lang.ThreadLocal<Logger>();

    public static void log(String msg) {
        getThreadLogger().log(Level.INFO, msg);
    }

    private static Logger getThreadLogger() {
        Logger logger = threadLocal.get();

        if(logger == null) {
            try {
                logger = Logger.getLogger(
                           Thread.currentThread().getName());
                // Logger 預設是在主控台輸出
                // 我們加入一個檔案輸出的Handler
                // 它會輸出XML的記錄文件
                logger.addHandler(
                    new FileHandler(
                           Thread.currentThread().getName() 
                           + ".log"));
            }
            catch(IOException e) {}

            threadLocal.set(logger);
        }

        return logger;
    }
}