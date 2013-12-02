package onlyfun.caterpillar;

import java.util.concurrent.BlockingQueue;

public class ConsumerQueue implements Runnable {
    private BlockingQueue<Integer> queue;
	
    public ConsumerQueue(BlockingQueue<Integer> queue) {
        this.queue = queue;
    }
	
    public void run() {
        for(int i = 1; i <= 10; i++) {
            try {
                // wait for a random time
                Thread.sleep((int) (Math.random() * 3000));
                queue.take();
            }
            catch(InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}