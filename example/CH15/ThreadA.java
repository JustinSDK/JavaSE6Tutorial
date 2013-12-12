package onlyfun.caterpillar;
 
public class ThreadA {
    public static void main(String[] args) {
        System.out.println("Thread A 執行");

        Thread threadB = new Thread(new Runnable() { 
            public void run() { 
                try { 
                    System.out.println("Thread B 開始.."); 
                    for(int i = 0; i < 5; i++) { 
                        Thread.sleep(1000); 
                        System.out.println("Thread B 執行.."); 
                    }
                    System.out.println("Thread B 即將結束.."); 
                } 
                catch(InterruptedException e) { 
                    e.printStackTrace(); 
                } 
            } 
        });
        
        threadB.start();

        try {
            // Thread B 加入 Thread A
            threadB.join();
        } 
        catch(InterruptedException e) { 
            e.printStackTrace(); 
        } 

        System.out.println("Thread A 執行");
    }
}