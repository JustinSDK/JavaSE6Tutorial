package onlyfun.caterpillar;
 
import java.io.*;
import java.util.*;
 
public class RandomAccessFileDemo {
    public static void main(String[] args) {
        Student[] students = {
                new Student("Justin", 90), 
                new Student("momor", 95), 
                new Student("Bush", 88), 
                new Student("caterpillar", 84)}; 
        
        try {
            File file = new File(args[0]);
            // 建立RandomAccessFile實例並以讀寫模式開啟檔案
            RandomAccessFile randomAccessFile = 
                    new RandomAccessFile(file, "rw"); 
            
            for(int i = 0; i < students.length; i++) { 
              // 使用對應的write方法寫入資料
              randomAccessFile.writeChars(students[i].getName());
              randomAccessFile.writeInt(students[i].getScore()); 
            }
 
            Scanner scanner = new Scanner(System.in);
 
            System.out.print("讀取第幾筆資料？"); 
            
            int num = scanner.nextInt(); 
            
            // 使用seek()方法操作存取位置
            randomAccessFile.seek((num-1) * Student.size()); 
            Student student = new Student(); 

            // 使用對應的read方法讀出資料
            student.setName(readName(randomAccessFile));
            student.setScore(randomAccessFile.readInt());

            System.out.println("姓名：" + student.getName());
            System.out.println("分數：" + student.getScore());
 
            // 設定關閉檔案
            randomAccessFile.close(); 
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("請指定檔案名稱");
        } 
        catch(IOException e) { 
            e.printStackTrace(); 
        }
    }
 
    private static String readName(
                           RandomAccessFile randomAccessfile)
                               throws IOException { 
        char[] name = new char[15]; 
 
        for(int i = 0; i < name.length; i++) 
            name[i] = randomAccessfile.readChar(); 

        // 將空字元取代為空白字元並傳回
        return new String(name).replace('\0', ' '); 
    } 
}