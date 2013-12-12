package onlyfun.caterpillar;

import java.util.logging.*;

public class LoggingLevelDemo2 {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger("loggingLevelDemo2");
        // 顯示所有等級的訊息
        logger.setLevel(Level.ALL);
        
        ConsoleHandler consoleHandler = new ConsoleHandler();
        // 顯示所有等級的訊息
        consoleHandler.setLevel(Level.ALL);
        // 設定處理者為ConsoleHandler
        logger.addHandler(consoleHandler);
        
        logger.severe("嚴重訊息");
        logger.warning("警示訊息");
        logger.info("一般訊息");
        logger.config("設定方面的訊息");
        logger.fine("細微的訊息");
        logger.finer("更細微的訊息");
        logger.finest("最細微的訊息");
    }
}