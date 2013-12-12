package onlyfun.caterpillar;

import java.util.logging.*;

public class TableFormatterDemo {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger("tableFormatter");
        
        try {
            for(Handler h : logger.getParent().getHandlers()) {
                if(h instanceof ConsoleHandler) {
                    h.setFormatter(new TableFormatter());
                }
            }
            
            logger.info("訊息1");
            logger.warning("訊息2");
        } catch (SecurityException e) {
            e.printStackTrace();
        }
    }
}