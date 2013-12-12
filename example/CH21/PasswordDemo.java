package onlyfun.caterpillar;

public class PasswordDemo {
    public static void main(String[] args) {
        while(true) {
            System.out.print("輸入名稱：");
            String name = System.console().readLine();

            System.out.print("輸入密碼： ");
            char[] passwd = System.console().readPassword();
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