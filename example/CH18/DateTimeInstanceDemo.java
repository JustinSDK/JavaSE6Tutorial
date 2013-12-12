package onlyfun.caterpillar;
 
import java.text.DateFormat;
import java.util.Date;

public class DateTimeInstanceDemo {
    public static void main(String[] args) {
        // 取得目前時間
        Date date = new Date(); 

        // 簡短資訊格式
        DateFormat shortFormat = 
            DateFormat.getDateTimeInstance( 
                DateFormat.SHORT, DateFormat.SHORT); 
        // 中等資訊格式
        DateFormat mediumFormat = 
            DateFormat.getDateTimeInstance( 
                DateFormat.MEDIUM, DateFormat.MEDIUM); 
        // 長資訊格式
        DateFormat longFormat = 
            DateFormat.getDateTimeInstance( 
                DateFormat.LONG, DateFormat.LONG); 
        // 詳細資訊格式
        DateFormat fullFormat = 
            DateFormat.getDateTimeInstance( 
                DateFormat.FULL, DateFormat.FULL); 

        System.out.println("簡短資訊格式：" + 
                      shortFormat.format(date)); 
        System.out.println("中等資訊格式：" + 
                      mediumFormat.format(date)); 
        System.out.println("長資訊格式：" + 
                      longFormat.format(date)); 
        System.out.println("詳細資訊格式：" + 
                      fullFormat.format(date)); 
    }
}