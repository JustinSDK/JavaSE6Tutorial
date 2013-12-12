package onlyfun.caterpillar;

import java.io.*; 
import java.sql.*;

public class LobDemo {    
    public static void main(String[] args) {
        DBSource dbsource = null;
        Connection conn = null;
        PreparedStatement pstmt = null;
        
        try {
            dbsource = new SimpleDBSource();
            conn = dbsource.getConnection(); 

            // 取得檔案
            File file = new File(args[0]); 
            int length = (int) file.length(); 
            InputStream fin = new FileInputStream(file); 

            // 填入資料庫
            pstmt = conn.prepareStatement( 
            "INSERT INTO t_file VALUES(?, ?, ?)");
            pstmt.setInt(1, 1);
            pstmt.setString(2, args[0]); 
            pstmt.setBinaryStream (3, fin, length); 
            pstmt.executeUpdate(); 
            pstmt.clearParameters(); 

            fin.close(); 
        }
        catch(SQLException e) { 
            e.printStackTrace(); 
        }  
        catch(IOException e) { 
            e.printStackTrace(); 
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } 
        finally {
            if(pstmt != null) {
                try {
                    pstmt.close();
                }   
                catch(SQLException e) {
                    e.printStackTrace();
                }
            }
        } 

        Statement stmt = null;
        
        try {
            // 從資料庫取出檔案
            stmt = conn.createStatement(); 
            ResultSet result = stmt.executeQuery(
            "SELECT * FROM t_file"); 
            result.next(); 
            String filename = result.getString(2); 
            Blob blob = result.getBlob(3); 

            // 寫入檔案 
            FileOutputStream fout = 
                new FileOutputStream(filename + ".bak"); 
            fout.write(blob.getBytes(1, (int)blob.length())); 
            fout.flush(); 
            fout.close();
        } 
        catch(SQLException e) { 
            e.printStackTrace(); 
        } 
        catch(IOException e) { 
            e.printStackTrace(); 
        } 
        finally {
            if(stmt != null) {
                try {
                    stmt.close();
                }   
                catch(SQLException e) {
                    e.printStackTrace();
                }
            }
            if(conn != null) {
                try {
                    dbsource.closeConnection(conn);
                }
                catch(SQLException e) {
                    e.printStackTrace();
                }
            }
        } 
    }
} 
