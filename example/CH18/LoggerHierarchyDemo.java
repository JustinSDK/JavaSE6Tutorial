package onlyfun.caterpillar;
 
import java.util.logging.*;

public class LoggerHierarchyDemo {
    public static void main(String[] args) {
        Logger onlyfunLogger = Logger.getLogger("onlyfun");
        Logger caterpillarLogger = 
                     Logger.getLogger("onlyfun.caterpillar");

        System.out.println("root logger: " 
                    + onlyfunLogger.getParent());
        System.out.println("onlyfun logger: " 
                    + caterpillarLogger.getParent().getName());

        System.out.println("caterpillar logger: " 
                   + caterpillarLogger.getName() + "\n");
        
        onlyfunLogger.setLevel(Level.WARNING);
        caterpillarLogger.info("caterpillar' info");
        
        caterpillarLogger.setLevel(Level.INFO);
        caterpillarLogger.info("caterpillar' info");
    }
}