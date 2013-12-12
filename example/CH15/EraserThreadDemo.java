package onlyfun.caterpillar;

import java.util.Scanner;

public class EraserThreadDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while(true) {
            System.out.print("輸入名稱：");
            String name = scanner.next();

            System.out.print("輸入密碼： ");
            // 啟動 Eraser 執行緒
            EraserThread eraserThread = new EraserThread('#');
            eraserThread.start();
            String password = scanner.next();
            eraserThread.setActive(false);

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