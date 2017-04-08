package onlyfun.caterpillar;

public class SomeThread implements Runnable {
    public void run() { 
        System.out.println("sleep....至 blocked 狀態"); 
        while(true) {
            try { 
                Thread.sleep(9999); 
            } 
            catch(InterruptedException e) { 
                System.out.println("I am interrupted...."); 
            } 
        }
    } 

    public static void main(String[] args) { 
        Thread thread = 
                 new Thread(new SomeThread()); 
        thread.start(); 
        thread.interrupt(); 
    } 
}