package onlyfun.caterpillar;
 
import java.io.*; 
 
public class FileStreamDemo {
    public static void main(String[] args) {
        try { 
            byte[] buffer = new byte[1024]; 

            // 來源檔案
            FileInputStream fileInputStream = 
                new FileInputStream(new File(args[0])); 
            // 目的檔案
            FileOutputStream fileOutputStream = 
                new FileOutputStream(new File(args[1])); 

            // available()可取得未讀取的資料長度
            System.out.println("複製檔案：" + 
                    fileInputStream.available() + "位元組"); 
            
            while(true) { 
                if(fileInputStream.available() < 1024) { 
                    // 剩餘的資料比1024位元組少
                    // 一位元一位元讀出再寫入目的檔案
                    int remain = -1; 
                    while((remain = fileInputStream.read())
                                           != -1) {
                        fileOutputStream.write(remain); 
                    }
                    break; 
                } 
                else { 
                    // 從來源檔案讀取資料至緩衝區 
                    fileInputStream.read(buffer); 
                    // 將陣列資料寫入目的檔案 
                    fileOutputStream.write(buffer); 
                } 
            } 

            // 關閉串流 
            fileInputStream.close(); 
            fileOutputStream.close(); 

            System.out.println("複製完成"); 
        } 
        catch(ArrayIndexOutOfBoundsException e) { 
            System.out.println(
                      "using: java FileStreamDemo src des"); 
            e.printStackTrace(); 
        } 
        catch(IOException e) { 
            e.printStackTrace(); 
        } 
    }
}