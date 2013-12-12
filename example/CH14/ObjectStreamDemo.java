package onlyfun.caterpillar;
 
import java.io.*;
import java.util.*;
 
public class ObjectStreamDemo {
    public static void main(String[] args) {
        User[] users = {new User("cater", 101),
                        new User("justin", 102)}; 
        // 寫入新檔
        writeObjectsToFile(users, args[0]);

        try {
            // 讀取檔案資料
            users = readObjectsFromFile(args[0]);
            // 顯示讀回的物件
            for(User user : users) {
                System.out.printf("%s\t%d%n", user.getName(), user.getNumber());
            }
            System.out.println();
            
            users = new User[2];
            users[0] = new User("momor", 103);
            users[1] = new User("becky", 104);
            
            // 附加新物件至檔案
            appendObjectsToFile(users, args[0]);
            
            // 讀取檔案資料
            users = readObjectsFromFile(args[0]);
            // 顯示讀回的物件
            for(User user : users) {
                System.out.printf("%s\t%d%n", user.getName(), user.getNumber());
            }
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("沒有指定檔名");
        }
        catch(FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    // 將指定的物件寫入至指定的檔案
    public static void writeObjectsToFile(
                         Object[] objs, String filename) { 
        File file = new File(filename);
 
        try { 
            ObjectOutputStream objOutputStream = 
                new ObjectOutputStream(
                      new FileOutputStream(file)); 
            for(Object obj : objs) {
                // 將物件寫入檔案
                objOutputStream.writeObject(obj); 
            }
            // 關閉串流
            objOutputStream.close(); 
        } 
        catch(IOException e) { 
            e.printStackTrace(); 
        }
    }
    
    // 將指定檔案中的物件資料讀回
    public static User[] readObjectsFromFile(
                             String filename) 
                               throws FileNotFoundException {
        File file = new File(filename); 
 
        // 如果檔案不存在就丟出例外
        if(!file.exists()) 
            throw new FileNotFoundException(); 
 
        // 使用List先儲存讀回的物件
        List<User> list = new ArrayList<User>();
        
        try {
            FileInputStream fileInputStream = 
                new FileInputStream(file);
            ObjectInputStream objInputStream = 
                new ObjectInputStream(fileInputStream); 
            
            while(fileInputStream.available() > 0) {
                list.add((User) objInputStream.readObject());
            }
            objInputStream.close(); 
        } 
        catch(ClassNotFoundException e) { 
            e.printStackTrace(); 
        } 
        catch(IOException e) { 
            e.printStackTrace(); 
        }
 
        User[] users = new User[list.size()];
        return list.toArray(users);
    }
 
    // 將物件附加至指定的檔案之後
    public static void appendObjectsToFile(
                           Object[] objs, String filename) 
                               throws FileNotFoundException {
  
        File file = new File(filename); 
 
        // 如果檔案不存在則丟出例外
        if(!file.exists()) 
             throw new FileNotFoundException(); 

        try {
            // 附加模式
            ObjectOutputStream objOutputStream = 
               new ObjectOutputStream(
                  new FileOutputStream(file, true)) { 
                    // 如果要附加物件至檔案後
                    // 必須重新定義這個方法
                    protected void writeStreamHeader() 
                                     throws IOException {} 
               };  
 
            for(Object obj : objs) {
                // 將物件寫入檔案
                objOutputStream.writeObject(obj); 
            }
            objOutputStream.close(); 
        } 
        catch(IOException e) { 
            e.printStackTrace(); 
        } 
    }
}