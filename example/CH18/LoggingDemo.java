package onlyfun.caterpillar;
 
import java.util.logging.*; 

public class LoggingDemo {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger("LoggingDemo");
        
        try {
            System.out.println(args[0]);
        }
        catch(ArrayIndexOutOfBoundsException e) {
            logger.warning("沒有提供執行時的引數！");
        }                
    }
}