package onlyfun.caterpillar;

import java.awt.*;
import javax.swing.*;

public class SystemTrayDemo2 {
    public static void main(String[] args) {
        if(SystemTray.isSupported()) {
            SystemTray tray = SystemTray.getSystemTray();
            Image image = Toolkit.getDefaultToolkit()
                                 .getImage("musical_note_smile.gif");
            PopupMenu popup = new PopupMenu();
            MenuItem item = new MenuItem("開啟JNotePad 1.0");
            popup.add(item);
            TrayIcon trayIcon = new TrayIcon(image, "JNotePad 1.0", popup);
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