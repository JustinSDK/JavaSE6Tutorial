package onlyfun.caterpillar;
 
public class DaemonThread { 
    public static void main(String[] args) {

        Thread thread = new Thread(
        // 這是匿名類別的寫法
            new Runnable() {
                public void run() { 
                    while(true) { 
                        System.out.print("T"); 
                    } 
                }        
            }); 
        // 設定為Daemon執行緒
        thread.setDaemon(true); 
        thread.start(); 
    }
}