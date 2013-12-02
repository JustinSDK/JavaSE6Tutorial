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
            
            logger.info("°T®§1");
            logger.warning("°T®§2");
        } catch (SecurityException e) {
            e.printStackTrace();
        }
    }
}