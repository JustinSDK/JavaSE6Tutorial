package onlyfun.caterpillar;
 
import java.io.*;
 
public class DataStreamDemo {
    public static void main(String[] args) {
        Member[] members = {new Member("Justin", 90), 
                              new Member("momor", 95), 
                              new Member("Bush", 88)}; 
        try { 
            DataOutputStream dataOutputStream = 
                new DataOutputStream( 
                         new FileOutputStream(args[0])); 
            
            for(Member member : members) { 
               // 寫入UTF字串
               dataOutputStream.writeUTF(member.getName()); 
               // 寫入int資料
               dataOutputStream.writeInt(member.getAge()); 
            } 
            // 出清所有資料至目的地
            dataOutputStream.flush(); 
            // 關閉串流
            dataOutputStream.close(); 
            
            DataInputStream dataInputStream = 
                new DataInputStream( 
                         new FileInputStream(args[0])); 
            // 讀出資料並還原為物件
            for(int i = 0; i < members.length; i++) { 
                // 讀出UTF字串
                String name = dataInputStream.readUTF(); 
                // 讀出int資料
                int score = dataInputStream.readInt();
                members[i] = new Member(name, score); 
            } 
            // 關閉串流
            dataInputStream.close(); 

            // 顯示還原後的資料
            for(Member member : members) { 
               System.out.printf("%s\t%d%n", member.getName(), member.getAge());
            } 
        } 
        catch(IOException e) { 
            e.printStackTrace(); 
        } 
    }
}
 