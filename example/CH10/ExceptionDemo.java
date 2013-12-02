import java.io.*; 
 
public class ExceptionDemo { 
    public static void main(String[] args) { 
        try { 
            throw new ArithmeticException("จาฅ~ด๚ธี"); 
        } 
        catch(Exception e) { 
            System.out.println(e.toString()); 
        } 
        catch(ArithmeticException e) { 
            System.out.println(e.toString()); 
        } 
    } 
}