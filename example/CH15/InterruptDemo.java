package onlyfun.caterpillar;
 
public class InterruptDemo { 
    public static void main(String[] args) { 
        Thread thread = new Thread(new Runnable() { 
            public void run() { 
                try { 
                    // 暫停99999毫秒
                    Thread.sleep(99999); 
                } 
                catch(InterruptedException e) { 
                    System.out.println("I'm interrupted!!"); 
                } 
             } 
        }); 
 
      thread.start(); 
      thread.interrupt(); // interrupt it right now 
   } 
}