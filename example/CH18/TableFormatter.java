package onlyfun.caterpillar;

import java.util.logging.*;

public class TableFormatter extends Formatter {
    public String format(LogRecord logRecord) {
        return
            "LogRecord info: " + 
            logRecord.getSourceClassName() + "\n" +
            "Level\t|\tLoggerName\t|\tMessage\t|\n" +
            logRecord.getLevel() + "\t|\t" +
            logRecord.getLoggerName() + "\t|\t" +
            logRecord.getMessage() + "\t|\n\n";
    }
}