package onlyfun.caterpillar;

import java.util.Date;

public class DateDemo {
    public static void main(String[] args) {
        Date date = new Date();
        
        System.out.println("現在時間 " 
                      + date.toString());
        System.out.println("自1970/1/1至今的毫秒數 " 
                      + date.getTime());
    }
}