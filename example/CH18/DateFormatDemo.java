package onlyfun.caterpillar;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
 
public class DateFormatDemo {
    public static void main(String[] args) {
        Date date = new Date();

        DateFormat dateFormat = 
            new SimpleDateFormat("EE-MM-dd-yyyy");
        
        System.out.println(dateFormat.format(date));
    }
}