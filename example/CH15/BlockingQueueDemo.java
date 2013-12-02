package onlyfun.caterpillar;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingQueueDemo {
    public static void main(String[] args) {
        BlockingQueue<Integer> queue = new ArrayBlockingQueue<Integer>(1); 
        
        Thread producerThread = new Thread(
                new ProducerQueue(queue)); 
        Thread consumerThread = new Thread(
                new ConsumerQueue(queue)); 
 
        producerThread.start(); 
        consumerThread.start(); 
    }
}