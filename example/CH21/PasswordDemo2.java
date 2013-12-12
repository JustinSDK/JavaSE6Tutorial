package onlyfun.caterpillar;

import java.io.Console;

public class PasswordDemo2 {
    public static void main(String[] args) {
        Console console = System.console();
        while(true) {

            String name = console.readLine("[%s] ", "輸入名稱…");

            char[] passwd = console.readPassword("[%s]", "輸入密碼…");
            String password = new String(passwd);

            if("caterpillar".equals(name) &&
               "123456".equals(password)) {
                System.out.println("歡迎 caterpillar ");
                break;
            }
            else {
                System.out.printf("%s，名稱或密碼錯誤，請重新輸入！%n", name);
            }
        }
        
    }
}