package onlyfun.caterpillar;

public class EraserThread extends Thread {
    private boolean active;
    private String mask;
    
    public EraserThread() {
        this('*');
    }

    public EraserThread(char maskChar) {
        active = true;
        mask = "\010" + maskChar;
    }

    // 停止執行緒時設定為false
    public void setActive(boolean active) {
        this.active = active;
    }

    public boolean isActive() {
        return active;
    }

    // 重新定義run()方法
    public void run () {
        while(isActive()) {
            System.out.print(mask);
	     try {
                // 暫停目前的執行緒50毫秒
	        Thread.currentThread().sleep(50);
             } 
             catch(InterruptedException e) {
                 e.printStackTrace();
             }
        }
    }
}