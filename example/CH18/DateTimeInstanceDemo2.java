package onlyfun.caterpillar;
 
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class DateTimeInstanceDemo2 {
    public static void main(String[] args) {
        // 取得目前時間
        Date date = new Date(); 

        // en: 英語系 US: 美國
        Locale locale = new Locale("en", "US");

        // 簡短資訊格式
        DateFormat shortFormat = 
           DateFormat.getDateTimeInstance( 
              DateFormat.SHORT, DateFormat.SHORT, locale); 
        // 中等資訊格式
        DateFormat mediumFormat = 
           DateFormat.getDateTimeInstance( 
              DateFormat.MEDIUM, DateFormat.MEDIUM, locale); 
        // 長資訊格式
        DateFormat longFormat = 
           DateFormat.getDateTimeInstance( 
              DateFormat.LONG, DateFormat.LONG, locale); 
        // 詳細資訊格式
        DateFormat fullFormat = 
           DateFormat.getDateTimeInstance( 
                DateFormat.FULL, DateFormat.FULL, locale); 

        System.out.println("short format: " + 
                      shortFormat.format(date)); 
        System.out.println("media format: " + 
                      mediumFormat.format(date)); 
        System.out.println("long format: " + 
                      longFormat.format(date)); 
        System.out.println("full format: " + 
                      fullFormat.format(date)); 
    }
}