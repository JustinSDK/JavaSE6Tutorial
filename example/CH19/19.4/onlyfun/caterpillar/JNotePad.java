package onlyfun.caterpillar;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.BorderFactory;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.KeyStroke;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;

public class JNotePad extends JFrame {
    private JMenuItem menuOpen;
    private JMenuItem menuSave;
    private JMenuItem menuSaveAs;
    private JMenuItem menuClose;

    private JMenu editMenu;
    private JMenuItem menuCut;
    private JMenuItem menuCopy;
    private JMenuItem menuPaste;

    private JMenuItem menuAbout;
    
    private JTextArea textArea;
    
    private JPopupMenu popUpMenu;
    
    private JLabel stateBar;
    
    private JFileChooser fileChooser;
    
    public JNotePad() {
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
        menuOpen = new JMenuItem("開啟舊檔");
        // 快速鍵設置
        menuOpen.setAccelerator(
                    KeyStroke.getKeyStroke(
                            KeyEvent.VK_O, 
                            InputEvent.CTRL_MASK));
        menuSave = new JMenuItem("儲存檔案");
        menuSave.setAccelerator(
                    KeyStroke.getKeyStroke(
                            KeyEvent.VK_S, 
                            InputEvent.CTRL_MASK));
        menuSaveAs = new JMenuItem("另存新檔");

        menuClose = new JMenuItem("關閉");
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
        editMenu = new JMenu("編輯");
        menuCut = new JMenuItem("剪下");
        menuCut.setAccelerator(
                    KeyStroke.getKeyStroke(KeyEvent.VK_X, 
                            InputEvent.CTRL_MASK));
        menuCopy = new JMenuItem("複製");
        menuCopy.setAccelerator(
                    KeyStroke.getKeyStroke(KeyEvent.VK_C, 
                            InputEvent.CTRL_MASK));
        menuPaste = new JMenuItem("貼上");
        menuPaste.setAccelerator(
                    KeyStroke.getKeyStroke(KeyEvent.VK_V, 
                            InputEvent.CTRL_MASK));
        editMenu.add(menuCut);
        editMenu.add(menuCopy);
        editMenu.add(menuPaste);
        
        // 設置「關於」選單        
        JMenu aboutMenu = new JMenu("關於");
        menuAbout = new JMenuItem("關於JNotePad");
        aboutMenu.add(menuAbout);
        
        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(aboutMenu);
        
        setJMenuBar(menuBar);
        
        // 文字編輯區域
        textArea = new JTextArea();
        textArea.setFont(new Font("細明體", Font.PLAIN, 16));
        textArea.setLineWrap(true);
        JScrollPane panel = new JScrollPane(textArea,
          ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,
          ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        
        Container contentPane = getContentPane();
        contentPane.add(panel, BorderLayout.CENTER);  
        
        // 狀態列
        stateBar = new JLabel("未修改");
        stateBar.setHorizontalAlignment(SwingConstants.LEFT); 
        stateBar.setBorder(
                BorderFactory.createEtchedBorder());
        contentPane.add(stateBar, BorderLayout.SOUTH);
        
        popUpMenu = editMenu.getPopupMenu();
        
        fileChooser = new JFileChooser();
    }
    
    private void setUpEventListener() {
        // 按下視窗關閉鈕事件處理
        addWindowListener(
            new WindowAdapter() {
                public void windowClosing(WindowEvent e) { 
                    closeFile();
                }
            }
        );
        
        // 選單 - 開啟舊檔
        menuOpen.addActionListener(
            new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    openFile();
                }
            }
        );

        // 選單 - 儲存檔案
        menuSave.addActionListener(
            new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    saveFile();
                }
            }
        );

        // 選單 - 另存新檔
        menuSaveAs.addActionListener(
            new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    saveFileAs();
                }
            }
        );

        // 選單 - 關閉檔案
        menuClose.addActionListener(
            new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    closeFile();
                }
            }
        );

        // 選單 - 剪下
        menuCut.addActionListener(
            new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    cut();
                }
            }
        );

        // 選單 - 複製
        menuCopy.addActionListener(
            new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    copy();
                }
            }
        );

        // 選單 - 貼上
        menuPaste.addActionListener(
            new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    paste();
                }
            }
        );
        
        // 選單 - 關於
        menuAbout.addActionListener(
            new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    // 顯示對話方塊
                    JOptionPane.showOptionDialog(null, 
                        "程式名稱:\n    JNotePad \n" + 
                        "程式設計:\n    良葛格\n" + 
                        "簡介:\n    一個簡單的文字編輯器\n" + 
                        "    可作為驗收Java的實作對象\n" +
                        "    歡迎網友下載研究交流\n\n" +
                        "http://caterpillar.onlyfun.net/",
                        "關於JNotePad",
                        JOptionPane.DEFAULT_OPTION,
                        JOptionPane.INFORMATION_MESSAGE,
                        null, null, null);
                }
            }
        );      
        
        // 編輯區鍵盤事件
        textArea.addKeyListener(
            new KeyAdapter() {
                public void keyTyped(KeyEvent e) {
                    processTextArea();
                }
            }
        );

        // 編輯區滑鼠事件
        textArea.addMouseListener(
            new MouseAdapter() {
                public void mouseReleased(MouseEvent e) {
                    if(e.getButton() == MouseEvent.BUTTON3)
                        popUpMenu.show(editMenu, e.getX(), e.getY());
                }
                
                public void mouseClicked(MouseEvent e) {
                    if(e.getButton() == MouseEvent.BUTTON1)
                        popUpMenu.setVisible(false);
                }
            }
        );        
    }

    private void openFile() {
        if(isCurrentFileSaved()) { // 文件是否為儲存狀態
            open(); // 開啟舊檔
        }
        else {
            // 顯示對話方塊
            int option = JOptionPane.showConfirmDialog(
                    null, "檔案已修改，是否儲存？",
                    "儲存檔案？", JOptionPane.YES_NO_OPTION, 
                    JOptionPane.WARNING_MESSAGE, null);
            switch(option) { 
                // 確認檔案儲存
                case JOptionPane.YES_OPTION:
                    saveFile(); // 儲存檔案
                     break;
               // 放棄檔案儲存
                case JOptionPane.NO_OPTION:
                    open();
                    break;
            }
        }
    }

    private void open() {
        // fileChooser 是 JFileChooser 的實例
        // 顯示檔案選取的對話方塊
        int option = fileChooser.showDialog(null, null);
        
        // 使用者按下確認鍵
        if(option == JFileChooser.APPROVE_OPTION) {
            try {
                // 開啟選取的檔案
                BufferedReader buf = 
                    new BufferedReader(
                       new FileReader(
                         fileChooser.getSelectedFile()));

                // 設定文件標題
                setTitle(fileChooser.getSelectedFile().toString());
                // 清除前一次文件
                textArea.setText("");
                // 設定狀態列
                stateBar.setText("未修改");
                // 取得系統相依的換行字元
                String lineSeparator = System.getProperty("line.separator");
                // 讀取檔案並附加至文字編輯區
                String text;
                while((text = buf.readLine()) != null) {
                    textArea.append(text);
                    textArea.append(lineSeparator);
                }

                buf.close();
            }   
            catch(IOException e) {
                JOptionPane.showMessageDialog(null, e.toString(),
                            "開啟檔案失敗", JOptionPane.ERROR_MESSAGE);
            }
        }        
    }

    private boolean isCurrentFileSaved() {
        if(stateBar.getText().equals("已修改")) {
            return false;
        }
        else {
            return true;
        }
    }

    private void saveFile() {
        // 從標題列取得檔案名稱
        File file = new File(getTitle());

        // 若指定的檔案不存在
        if(!file.exists()) {
            // 執行另存新檔
            saveFileAs();
        }
        else {
            try {
                // 開啟指定的檔案
                BufferedWriter buf = 
                    new BufferedWriter(
                            new FileWriter(file));
                // 將文字編輯區的文字寫入檔案
                buf.write(textArea.getText());
                buf.close();
                // 設定狀態列為未修改
                stateBar.setText("未修改");
            }
            catch(IOException e) {
                JOptionPane.showMessageDialog(null, e.toString(),
                                "寫入檔案失敗", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private void saveFileAs() {
        // 顯示檔案對話方塊
        int option = fileChooser.showDialog(null, null);

        // 如果確認選取檔案
        if(option == JFileChooser.APPROVE_OPTION) {
            // 取得選擇的檔案
            File file = fileChooser.getSelectedFile();
            
            // 在標題列上設定檔案名稱
            setTitle(file.toString());
            
            try {
                // 建立檔案
                file.createNewFile();
                // 進行檔案儲存
                saveFile();
            }
            catch(IOException e) {
                JOptionPane.showMessageDialog(null, e.toString(),
                            "無法建立新檔", JOptionPane.ERROR_MESSAGE);
            }
        }   
    }
    
    private void closeFile() {
        // 是否已儲存文件
        if(isCurrentFileSaved()) {
            // 釋放視窗資源，而後關閉程式
            dispose();
        }
        else {
            int option = JOptionPane.showConfirmDialog(
                    null, "檔案已修改，是否儲存？",
                    "儲存檔案？", JOptionPane.YES_NO_OPTION, 
                    JOptionPane.WARNING_MESSAGE, null);

            switch(option) {
                case JOptionPane.YES_OPTION:
                    saveFile();
                    break;
                case JOptionPane.NO_OPTION:
                    dispose();
            }
        }
    }
    
    private void cut() {
        textArea.cut();
        stateBar.setText("已修改");
        popUpMenu.setVisible(false);
    }

    private void copy() {
        textArea.copy();
        popUpMenu.setVisible(false);    
    }

    private void paste() {
        textArea.paste();
        stateBar.setText("已修改");
        popUpMenu.setVisible(false);
    }

    private void processTextArea() {
        stateBar.setText("已修改");
    }
    
    public static void main(String[] args) {
        new JNotePad();
    }
}
