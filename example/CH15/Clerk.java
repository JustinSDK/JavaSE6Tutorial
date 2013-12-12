package onlyfun.caterpillar;
 
public class Clerk {
    // -1 表示目前沒有產品
    private int product = -1; 
 
    // 這個方法由生產者呼叫
    public synchronized void setProduct(int product) { 
        if(this.product != -1) { 
            try { 
                // 目前店員沒有空間收產品，請稍候！
                wait(); 
            } 
            catch(InterruptedException e) { 
                e.printStackTrace(); 
            } 
        } 
 
        this.product = product; 
        System.out.printf("生產者設定 (%d)%n", this.product); 

        // 通知等待區中的一個消費者可以繼續工作了
        notify(); 
    } 
    
    // 這個方法由消費者呼叫
    public synchronized int getProduct() { 
        if(this.product == -1) { 
            try { 
                // 缺貨了，請稍候！
                wait(); 
            } 
            catch(InterruptedException e) { 
                e.printStackTrace(); 
            } 
        } 
 
        int p = this.product; 
        System.out.printf(
                  "消費者取走 (%d)%n", this.product); 
        this.product = -1; 
 
        // 通知等待區中的一個生產者可以繼續工作了
        notify(); 
       
        return p; 
    } 
}