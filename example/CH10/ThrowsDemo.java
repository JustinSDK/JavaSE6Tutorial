public class ThrowsDemo { 
    public static void main(String[] args) { 
        try { 
            throwsTest(); 
        } 
        catch(ArithmeticException e) { 
            System.out.println("捕捉例外"); 
        } 
    }

    private static void throwsTest() 
                           throws ArithmeticException { 
        System.out.println("這只是一個測試"); 
        // 程式處理過程假設發生例外 
        throw new ArithmeticException(); 
    } 
}