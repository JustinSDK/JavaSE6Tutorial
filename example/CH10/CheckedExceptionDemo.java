import java.io.*; 
 
public class CheckedExceptionDemo { 
    public static void main(String[] args) { 
        try { 
            BufferedReader buf = new BufferedReader( 
                new InputStreamReader(System.in)); 
            System.out.print("請輸入整數: "); 
            int input = Integer.parseInt(buf.readLine()); 
            System.out.println("input x 10 = " + (input*10)); 
        } 
        catch(IOException e) { 
            System.out.println("I/O錯誤"); 
        } 
        catch(NumberFormatException e) { 
            System.out.println("輸入必須為整數"); 
        } 
    } 
}