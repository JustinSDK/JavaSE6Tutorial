package onlyfun.caterpillar;

import java.util.ResourceBundle;

public class I18NDemo {
    public static void main(String[] args) {
        ResourceBundle resource = 
                  ResourceBundle.getBundle("messages3");
        
        System.out.print(resource.getString(
                      "onlyfun.caterpillar.welcome") + "!");
        System.out.println(resource.getString(
                      "onlyfun.caterpillar.name") + "!");
    }
}