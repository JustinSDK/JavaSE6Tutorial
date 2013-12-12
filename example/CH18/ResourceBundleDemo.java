package onlyfun.caterpillar;

import java.util.ResourceBundle;

public class ResourceBundleDemo {
    public static void main(String[] args) {
        // 綁定messages.properties
        ResourceBundle resource = 
                  ResourceBundle.getBundle("messages");
        // 取得對應訊息
        System.out.print(resource.getString(
                      "onlyfun.caterpillar.welcome") + "!");
        System.out.println(resource.getString(
                      "onlyfun.caterpillar.name") + "!");
    }
}