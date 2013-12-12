package onlyfun.caterpillar;

import java.awt.*;

public class SystemTrayDemo {
    public static void main(String[] args) {
        if(SystemTray.isSupported()) {
            SystemTray tray = SystemTray.getSystemTray();
            Image image = Toolkit.getDefaultToolkit()
                                 .getImage("musical_note_smile.gif");
            TrayIcon trayIcon = new TrayIcon(image, "JNotePad 1.0");
            try {
                tray.add(trayIcon);
            } catch (AWTException e) {
                System.err.println("無法加入系統工具列圖示");
                e.printStackTrace();
            }
        } else {
            System.err.println("無法取得系統工具列");
        }
    }
}