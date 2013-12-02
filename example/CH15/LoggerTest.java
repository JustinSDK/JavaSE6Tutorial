package onlyfun.caterpillar;

public class LoggerTest {
    public static void main(String[] args) {
        new TestThread("thread1").start();
        new TestThread("thread2").start();
        new TestThread("thread3").start();
    }
}

class TestThread extends Thread {
    public TestThread(String name) {
        super(name);
    }

    public void run() {
        for(int i = 0; i < 10; i++) {
            SimpleThreadLogger.log(getName() + 
                                     ": message " + i);
            try {
                Thread.sleep(1000);
            }
            catch(Exception e) {
                SimpleThreadLogger.log(e.toString());
            }
        }
    }
}