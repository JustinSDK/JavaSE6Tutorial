package onlyfun.caterpillar;
 
public class ProductTest {
    public static void main(String[] args) {
        Clerk clerk = new Clerk(); 
 
        // 生產者執行緒
        Thread producerThread = 
            new Thread(
                new Producer(clerk)); 
        // 消費者執行緒
        Thread consumerThread = 
            new Thread(
                new Consumer(clerk)); 
 
        producerThread.start(); 
        consumerThread.start(); 
    }
}