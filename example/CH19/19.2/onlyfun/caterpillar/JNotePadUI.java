package onlyfun.caterpillar;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.KeyStroke;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;

public class JNotePadUI extends JFrame {
    public JNotePadUI() {
        super("新增文字檔案");
        setUpUIComponent();
        setUpEventListener();
        setVisible(true);
    }
    
    private void setUpUIComponent() {
        setSize(640, 480);
        
        // 選單列
        JMenuBar menuBar = new JMenuBar();
        
        // 設置「檔案」選單
        JMenu fileMenu = new JMenu("檔案");
        JMenuItem menuOpen = new JMenuItem("開啟舊檔");
        // 快速鍵設置
        menuOpen.setAccelerator(
                    KeyStroke.getKeyStroke(
                            KeyEvent.VK_O, 
                            InputEvent.CTRL_MASK));
        JMenuItem menuSave = new JMenuItem("儲存檔案");
        menuSave.setAccelerator(
                    KeyStroke.getKeyStroke(
                            KeyEvent.VK_S, 
                            InputEvent.CTRL_MASK));
        JMenuItem menuSaveAs = new JMenuItem("另存新檔");

        JMenuItem menuClose = new JMenuItem("關閉");
        menuClose.setAccelerator(
                    KeyStroke.getKeyStroke(
                            KeyEvent.VK_Q, 
                            InputEvent.CTRL_MASK));
        
        fileMenu.add(menuOpen);
        fileMenu.addSeparator(); // 分隔線
        fileMenu.add(menuSave);
        fileMenu.add(menuSaveAs);        
        fileMenu.addSeparator(); // 分隔線
        fileMenu.add(menuClose);
        
        // 設置「編輯」選單        
        JMenu editMenu = new JMenu("編輯");
        JMenuItem menuCut = new JMenuItem("剪下");
        menuCut.setAccelerator(
                    KeyStroke.getKeyStroke(KeyEvent.VK_X, 
                            InputEvent.CTRL_MASK));
        JMenuItem menuCopy = new JMenuItem("複製");
        menuCopy.setAccelerator(
                    KeyStroke.getKeyStroke(KeyEvent.VK_C, 
                            InputEvent.CTRL_MASK));
        JMenuItem menuPaste = new JMenuItem("貼上");
        menuPaste.setAccelerator(
                    KeyStroke.getKeyStroke(KeyEvent.VK_V, 
                            InputEvent.CTRL_MASK));
        editMenu.add(menuCut);
        editMenu.add(menuCopy);
        editMenu.add(menuPaste);
        
        // 設置「關於」選單        
        JMenu aboutMenu = new JMenu("關於");
        JMenuItem menuAbout = new JMenuItem("關於JNotePad");
        aboutMenu.add(menuAbout);
        
        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(aboutMenu);
        
        setJMenuBar(menuBar);
        
        // 文字編輯區域
        JTextArea textArea = new JTextArea();
        textArea.setFont(new Font("細明體", Font.PLAIN, 16));
        textArea.setLineWrap(true);
        JScrollPane panel = new JScrollPane(textArea,
          ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,
          ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        
        Container contentPane = getContentPane();
        contentPane.add(panel, BorderLayout.CENTER);  
        
        // 狀態列
        JLabel stateBar = new JLabel("未修改");
        stateBar.setHorizontalAlignment(SwingConstants.LEFT); 
        stateBar.setBorder(
                BorderFactory.createEtchedBorder());
        contentPane.add(stateBar, BorderLayout.SOUTH);        
    }
    
    private void setUpEventListener() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new JNotePadUI();
    }
}
