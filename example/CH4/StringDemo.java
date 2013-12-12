public class StringDemo {
    public static void main(String[] args) {
        String text = "Have a nice day!! :)";
		
        System.out.println("原文：" + text);
        
        // 傳回全為大寫的字串內容
        System.out.println("大寫：" + text.toUpperCase());

        // 轉回全為小寫的字串內容
        System.out.println("小寫：" + text.toLowerCase());

        // 計算字串長度
        System.out.println("長度：" + text.length());

        // 傳回取代文字後的字串
        System.out.println("取代：" + text.replaceAll("nice", "good"));

        // 傳回指定位置後的子字串
        System.out.println("子字串：" + text.substring(5));
    }
}