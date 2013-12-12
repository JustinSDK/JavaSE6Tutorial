package onlyfun.caterpillar;
 
import java.io.*;
 
public class BufferedStreamDemo {
    public static void main(String[] args) {
        try {
            byte[] data = new byte[1]; 

            File srcFile = new File(args[0]); 
            File desFile = new File(args[1]); 

            BufferedInputStream bufferedInputStream = 
                new BufferedInputStream(
                         new FileInputStream(srcFile)); 
            BufferedOutputStream bufferedOutputStream = 
                new BufferedOutputStream(
                         new FileOutputStream(desFile));
 
            System.out.println("複製檔案：" + 
                             srcFile.length() + "位元組");

            while(bufferedInputStream.read(data) != -1) { 
                bufferedOutputStream.write(data); 
            }
            
            // 將緩衝區中的資料全部寫出 
            bufferedOutputStream.flush();
 
            // 關閉串流 
            bufferedInputStream.close(); 
            bufferedOutputStream.close(); 

            System.out.println("複製完成"); 
        } 
        catch(ArrayIndexOutOfBoundsException e) { 
            System.out.println(
                    "using: java UseFileStream src des"); 
            e.printStackTrace(); 
        } 
        catch(IOException e) { 
            e.printStackTrace(); 
        } 
    }
}