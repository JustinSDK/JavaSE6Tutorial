package onlyfun.caterpillar;

import java.util.*;
import java.io.*;

public class SequenceStreamDemo {
    public static void main(String[] args) {
        try { 
            // args[0]: 指定分割（s）或連接（c）
            switch (args[0].charAt(1)) {
                case 's':
                    // args[1]: 每個分割檔案的大小
                    int size = Integer.parseInt(args[1]);
                    // args[2]: 指定要被分割的檔案名稱
                    seperate(args[2], size); 
                    break;
                case 'c':
                    // args[1]: 指定要被組合的檔案個數
                    int number = Integer.parseInt(args[1]);
                    // args[2]: 組合後的檔案名稱
                    concatenate(args[2], number); 
                    break;
            }
        } 
        catch(ArrayIndexOutOfBoundsException e) { 
            System.out.println(
                "Using: java UseSequenceStream [-s/-c]" + 
                " (size/number) filename"); 
            System.out.println("-s: 分割檔案\n-c: 組合檔案"); 
        } 
        catch(IOException e) { 
            e.printStackTrace(); 
        } 
    }

    // 分割檔案
    public static void seperate(String filename, int size) 
                                    throws IOException { 
        FileInputStream fileInputStream = 
            new FileInputStream(new File(filename)); 
        BufferedInputStream bufInputStream = 
            new BufferedInputStream(fileInputStream); 

        byte[] data = new byte[1]; 
        int count = 0;  
        // 從原檔案大小及指定分割的大小
        // 決定要分割為幾個檔案 
        if(fileInputStream.available() % size == 0) 
            count = fileInputStream.available() / size; 
        else 
            count = fileInputStream.available() / size + 1; 
 
        // 開始進行分割
        for(int i = 0; i < count; i++) { 
            int num = 0; 
            // 分割的檔案加上底線與編號
            File file = new File(filename + "_" + (i + 1));
            BufferedOutputStream bufOutputStream = 
                new BufferedOutputStream( 
                       new FileOutputStream(file)); 
 
            while(bufInputStream.read(data) != -1) { 
                bufOutputStream.write(data); 
                num++; 
                if(num == size) { // 分割出一個檔案
                    bufOutputStream.flush(); 
                    bufOutputStream.close(); 
                    break; 
                } 
            } 
 
            if(num < size) { 
                bufOutputStream.flush(); 
                bufOutputStream.close(); 
            } 
        } 
 
        System.out.println("分割為" + count + "個檔案"); 
    } 

    // 連接檔案
    public static void concatenate(String filename, 
                          int number) throws IOException {
        // 收集檔案用的List
        List<InputStream> list = 
                new ArrayList<InputStream>();
        
        for(int i = 0; i < number; i++) {
            // 檔案名必須為底線加上編號
            File file = new File(filename + "_" + (i+1));
            list.add(i, new FileInputStream(file));
        }
        
        final Iterator<InputStream> iterator = list.iterator();
        
        // SequenceInputStream 需要一個Enumeration物件來建構
        Enumeration<InputStream> enumation = 
            new Enumeration<InputStream>() {
                public boolean hasMoreElements() {
                    return iterator.hasNext();
                }

                public InputStream nextElement() {
                    return iterator.next();
                }
            };
 
        // 建立SequenceInputStream
        // 並使用BufferedInputStream
        BufferedInputStream bufInputStream = 
            new BufferedInputStream( 
                    new SequenceInputStream(enumation), 
                    8192); 

        BufferedOutputStream bufOutputStream = 
                    new BufferedOutputStream( 
                       new FileOutputStream(filename), 8192); 

        byte[] data = new byte[1]; 
        // 讀取所有檔案資料並寫入目的地檔案
        while(bufInputStream.read(data) != -1) 
            bufOutputStream.write(data); 

        bufInputStream.close(); 
        bufOutputStream.flush(); 
        bufOutputStream.close(); 
        System.out.println("組合" + number + "個檔案 OK!!"); 
    } 
}