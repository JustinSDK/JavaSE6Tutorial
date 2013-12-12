package onlyfun.caterpillar;

import java.util.logging.*;

public class LoggingLevelDemo3 {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger("loggingLevelDemo3");
        logger.setLevel(Level.ALL);
        
        ConsoleHandler consoleHandler = new ConsoleHandler();
        consoleHandler.setLevel(Level.ALL);
        logger.addHandler(consoleHandler);
        
        logger.log(Level.SEVERE, "嚴重訊息");
        logger.log(Level.WARNING, "警示訊息");
        logger.log(Level.INFO, "一般訊息");
        logger.log(Level.CONFIG, "設定方面的訊息");
        logger.log(Level.FINE, "細微的訊息");
        logger.log(Level.FINER, "更細微的訊息");
        logger.log(Level.FINEST, "最細微的訊息");
    }
}