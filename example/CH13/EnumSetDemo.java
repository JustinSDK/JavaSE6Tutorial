package onlyfun.caterpillar;
 
import java.util.*;

// 定義列舉型態
enum FontConstant { Plain, Bold, Italic }
 
public class EnumSetDemo {
    public static void main(String[] args) {
        // 建立列舉值集合
        EnumSet<FontConstant> enumSet = 
           EnumSet.of(FontConstant.Plain, 
                      FontConstant.Bold);
        // 顯示集合內容
        showEnumSet(enumSet);
        // 顯示補集合內容
        showEnumSet(EnumSet.complementOf(enumSet));
    }

    public static void showEnumSet(
                       EnumSet<FontConstant> enumSet) {
        for(FontConstant constant : enumSet) {
            System.out.println(constant);
        }
        System.out.println();
    }
}