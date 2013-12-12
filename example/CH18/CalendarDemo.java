package onlyfun.caterpillar;

import java.util.Calendar;

public class CalendarDemo {
    public static void main(String[] args) {
        Calendar rightNow = Calendar.getInstance();
        
        System.out.println("現在時間是：");
        System.out.println("西元：" +
                   rightNow.get(Calendar.YEAR));
        System.out.println("月：" + 
                   getChineseMonth(rightNow));
        System.out.println("日：" + 
                   rightNow.get(Calendar.DAY_OF_MONTH));
        System.out.println("星期：" + 
                   getChineseDayOfWeek(rightNow));
    }
    
    public static String getChineseMonth(Calendar rightNow) {
        String chineseMonth = null;
        
        switch(rightNow.get(Calendar.MONTH)) {
            case Calendar.JANUARY:
                chineseMonth = "一";
                break;
            case Calendar.FEBRUARY:
                chineseMonth = "二";
                break;
            case Calendar.MARCH:
                chineseMonth = "三";
                break;
            case Calendar.APRIL:
                chineseMonth = "四";
                break;
            case Calendar.MAY:
                chineseMonth = "五";
                break;
            case Calendar.JUNE:
                chineseMonth = "六";
                break;
            case Calendar.JULY:
                chineseMonth = "七";
                break;
            case Calendar.AUGUST:
                chineseMonth = "八";
                break;
            case Calendar.SEPTEMBER:
                chineseMonth = "九";
                break;
            case Calendar.OCTOBER:
                chineseMonth = "十";
                break;
            case Calendar.NOVEMBER:
                chineseMonth = "十一";
                break;
            case Calendar.DECEMBER:
                chineseMonth = "十二";
                break;                
        }
        
        return chineseMonth;
    }
    
    public static String getChineseDayOfWeek(
                                 Calendar rightNow) {
        String chineseDayOfWeek = null;
        
        switch(rightNow.get(Calendar.DAY_OF_WEEK)) {
            case Calendar.SUNDAY:
                chineseDayOfWeek = "日";
                break;
            case Calendar.MONDAY:
                chineseDayOfWeek = "一";
                break;
            case Calendar.TUESDAY:
                chineseDayOfWeek = "二";
                break;
            case Calendar.WEDNESDAY:
                chineseDayOfWeek = "三";
                break;
            case Calendar.THURSDAY:
                chineseDayOfWeek = "四";
                break;
            case Calendar.FRIDAY:
                chineseDayOfWeek = "五";
                break;
            case Calendar.SATURDAY:
                chineseDayOfWeek = "六";
                break;           
        }
        
        return chineseDayOfWeek;
    }
}