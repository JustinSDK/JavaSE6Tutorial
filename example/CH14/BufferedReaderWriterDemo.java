package onlyfun.caterpillar;
 
import java.io.*; 
 
public class BufferedReaderWriterDemo { 
    public static void main(String[] args) { 
        try { 
            // 緩衝System.in輸入串流
            BufferedReader bufReader = 
                new BufferedReader(
                      new InputStreamReader(System.in)); 
            // 緩衝FileWriter字元輸出串流
            BufferedWriter bufWriter = 
                new BufferedWriter(new FileWriter(args[0])); 
 
            String input = null; 

            // 每讀一行進行一次寫入動作
            while(!(input = 
                      bufReader.readLine()).equals("quit")) { 
                bufWriter.write(input); 
                // newLine()方法寫入與作業系統相依的換行字元
                bufWriter.newLine(); 
            } 
 
            bufReader.close(); 
            bufWriter.close(); 
        } 
        catch(ArrayIndexOutOfBoundsException e) { 
            System.out.println("沒有指定檔案");
        } 
        catch(IOException e) { 
            e.printStackTrace(); 
        } 
    } 
} 