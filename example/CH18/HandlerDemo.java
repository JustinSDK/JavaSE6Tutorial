package onlyfun.caterpillar;
 
import java.io.IOException;
import java.util.logging.*;
 
public class HandlerDemo {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger("handlerDemo");
        
        try {
            FileHandler fileHandler = 
                          new FileHandler("%h/myLogger.log");
            logger.addHandler(fileHandler);
            logger.info("´ú¸Õ°T®§");
        } catch (SecurityException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}