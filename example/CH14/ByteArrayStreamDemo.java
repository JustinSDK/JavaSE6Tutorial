package onlyfun.caterpillar;
 
import java.io.*;
import java.util.*;
 
public class ByteArrayStreamDemo {
    public static void main(String[] args) {
        try { 
            File file = new File(args[0]); 
            BufferedInputStream bufferedInputStream = 
                new BufferedInputStream( 
                     new FileInputStream(file)); 

            ByteArrayOutputStream arrayOutputStream = 
                new ByteArrayOutputStream(); 

            byte[] bytes = new byte[1];             

            // 將檔案內容寫入位元陣列串流
            while(bufferedInputStream.read(bytes) != -1) {
                arrayOutputStream.write(bytes);
            }
            arrayOutputStream.close(); 
            bufferedInputStream.close(); 

            // 以字元方式顯示位元陣列內容 
            bytes = arrayOutputStream.toByteArray(); 
            for(int i = 0; i < bytes.length; i++) {
                System.out.print((char) bytes[i]);
            }
            System.out.println(); 

            // 讓使用者輸入位置與字元修改位元陣列內容 
            Scanner scanner = new Scanner(System.in);

            System.out.print("輸入修改位置："); 
            int pos = scanner.nextInt();
            System.out.print("輸入修改字元："); 
            // 修改陣列中對應的字元
            bytes[pos-1] = (byte) scanner.next().charAt(0);

            // 將位元陣列內容存回檔案 
            ByteArrayInputStream byteArrayInputStream = 
                new ByteArrayInputStream(bytes); 
            BufferedOutputStream bufOutputStream = 
                new BufferedOutputStream( 
                     new FileOutputStream(file)); 
            byte[] tmp = new byte[1]; 
            while(byteArrayInputStream.read(tmp) != -1) 
                bufOutputStream.write(tmp); 
            byteArrayInputStream.close(); 
            bufOutputStream.flush(); 
            bufOutputStream.close(); 
        } 
        catch(ArrayIndexOutOfBoundsException e) { 
            System.out.println("請指定檔案名稱");
        } 
        catch(IOException e) { 
            e.printStackTrace(); 
        } 
    }
}