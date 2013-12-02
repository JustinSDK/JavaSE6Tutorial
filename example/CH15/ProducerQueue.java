package onlyfun.caterpillar;

import java.util.concurrent.BlockingQueue;

public class ProducerQueue implements Runnable {
    private BlockingQueue<Integer> queue;
	
    public ProducerQueue(BlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    public void run() {
        for(int product = 1; product <= 10; product++) {
            try {
                // wait for a random time
                Thread.sleep((int) Math.random() * 3000);
                queue.put(product);
            }
            catch(InterruptedException e) {
                e.printStackTrace();
            }
        } 
    }
}