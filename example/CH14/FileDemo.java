package onlyfun.caterpillar;
 
import java.io.*;
import java.util.*;
 
public class FileDemo {
    public static void main(String[] args) {
        try { 
            File file = new File(args[0]);
            if(file.isFile()) { // 是否為檔案
                System.out.println(args[0] + " 檔案"); 
                System.out.print(
                      file.canRead() ? "可讀 " : "不可讀 "); 
                System.out.print(
                      file.canWrite() ? "可寫 " : "不可寫 "); 
                System.out.println(
                      file.length() + "位元組"); 
            } 
            else { 
                // 列出所有的檔案及目錄
                File[] files = file.listFiles(); 
                ArrayList<File> fileList = 
                                    new ArrayList<File>(); 
                for(int i = 0; i < files.length; i++) { 
                    // 先列出目錄 
                    if(files[i].isDirectory()) { //是否為目錄
                        // 取得路徑名
                        System.out.println("[" + 
                                files[i].getPath() + "]"); 
                    }
                    else {
                        // 檔案先存入fileList，待會再列出
                        fileList.add(files[i]); 
                    }
                } 
 
                // 列出檔案 
                for(File f: fileList) {
                    System.out.println(f.toString());
                }
                System.out.println(); 
            } 
        } 
        catch(ArrayIndexOutOfBoundsException e) { 
            System.out.println(
                        "using: java FileDemo pathname"); 
        } 
    }
}