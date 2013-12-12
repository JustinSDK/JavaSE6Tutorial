package onlyfun.caterpillar;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorDemo {
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(5);
		
        for(int i = 0; i < 10; i++) {
            final int count = i;

            Runnable runnable = 
                        new Runnable() {
                            public void run() {
                                System.out.println(count);
                                try {
                                    Thread.sleep(2000);
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }	
                            }
			};

            service.submit(runnable);
        }
		
        service.shutdown(); // 最後記得關閉Thread pool
    }
}