package onlyfun.caterpillar;
 
import java.io.*;
 
public class FileReaderWriterDemo {
    public static void main(String[] args) {
        try { 
            FileReader fileReader = 
                new FileReader(args[0]); 
            FileWriter fileWriter = 
                new FileWriter(args[0] + ".txt"); 
 
            int in = 0; 
            char[] wlnChar = {'\r', '\n'}; 
            while((in = fileReader.read()) != -1) { 
                if(in == '\n') {
                    // 寫入"\r\n"
                    fileWriter.write(wlnChar); 
                }
                else 
                    fileWriter.write(in); 
            } 
            fileReader.close(); 
            fileWriter.close(); 
        } 
        catch(ArrayIndexOutOfBoundsException e) { 
            System.out.println("請指定檔案");
        } 
        catch(IOException e) { 
            e.printStackTrace(); 
        } 
    }
}