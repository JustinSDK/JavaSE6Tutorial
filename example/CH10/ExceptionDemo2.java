import java.io.*; 
 
public class ExceptionDemo2 { 
    public static void main(String[] args) { 
        try { 
            throw new ArithmeticException("จาฅ~ด๚ธี"); 
        } 
        catch(ArithmeticException e) { 
            System.out.println(e.toString()); 
        } 
        catch(Exception e) { 
            System.out.println(e.toString()); 
        } 
    } 
}