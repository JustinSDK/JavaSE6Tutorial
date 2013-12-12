package onlyfun.caterpillar;

import java.util.ResourceBundle;
import java.text.MessageFormat;

public class MessageFormatDemo {
    public static void main(String[] args) {
        try {
            // 綁定messages.properties
            ResourceBundle resource = 
                  ResourceBundle.getBundle("messages2");

            String message = resource.getString(
                  "onlyfun.caterpillar.greeting");
            Object[] params = 
                new Object[] {args[0], args[1]};
            MessageFormat formatter = 
                 new MessageFormat(message);

            // 顯示格式化後的訊息
            System.out.println(formatter.format(params));
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("沒有指定引數");
        }
    }
}