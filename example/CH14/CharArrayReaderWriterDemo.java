package onlyfun.caterpillar;
 
import java.io.*;
import java.util.*;
 
public class CharArrayReaderWriterDemo {
    public static void main(String[] args) {
        try { 
            File file = new File(args[0]); 
            BufferedReader bufInputReader = 
                new BufferedReader( 
                     new FileReader(file)); 
 
            // 將檔案讀入字元陣列 
            CharArrayWriter charArrayWriter = 
                new CharArrayWriter(); 
            char[] array = new char[1]; 
            while(bufInputReader.read(array) != -1) {
                charArrayWriter.write(array); 
            }
             
            charArrayWriter.close(); 
            bufInputReader.close(); 
 
            // 顯示字元陣列內容 
            array = charArrayWriter.toCharArray(); 
            for(int i = 0; i < array.length; i++) 
                System.out.print(array[i] + " "); 
            System.out.println(); 
 
            // 讓使用者輸入位置與字元修改字元陣列內容 
            Scanner scanner = new Scanner(System.in);
             
            System.out.print("輸入修改位置："); 
            int pos = scanner.nextInt(); 
            System.out.print("輸入修改字元："); 
            char ch = scanner.next().charAt(0); 
            array[pos-1] = ch; 
 
            // 將字元陣列內容存回檔案 
            CharArrayReader charArrayReader = 
                new CharArrayReader(array); 
            BufferedWriter bufWriter = 
                new BufferedWriter( 
                     new FileWriter(file)); 
            char[] tmp = new char[1]; 
            while(charArrayReader.read(tmp) != -1) {
                bufWriter.write(tmp); 
            }
            
            charArrayReader.close();
            bufWriter.flush(); 
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