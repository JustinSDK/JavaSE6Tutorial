package onlyfun.caterpillar;

import java.util.*;
import static java.util.Calendar.*;

public class CalendarDemo {
    public static void main(String[] args) {
        Calendar rightNow = Calendar.getInstance();
        Locale locale = Locale.getDefault();
       
        System.out.println("現在時間是：");
        System.out.printf("%s：%d %n",
           rightNow.getDisplayName(ERA, LONG, locale),
           rightNow.get(YEAR));
        System.out.println(
           rightNow.getDisplayName(MONTH, LONG, locale));
        System.out.printf("%d 日%n", 
           rightNow.get(DAY_OF_MONTH));
        System.out.println(
           rightNow.getDisplayName(DAY_OF_WEEK, LONG, locale));

    }   
}