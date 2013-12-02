package onlyfun.caterpillar;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ResultDemo {
    public static void main(String[] args) {
        DBSource dbsource = null;
        Connection conn = null;
        Statement stmt = null;
        try {
            dbsource = new SimpleDBSource();
            conn = dbsource.getConnection();
            
            stmt = conn.createStatement(
                            ResultSet.TYPE_SCROLL_INSENSITIVE, 
                            ResultSet.CONCUR_READ_ONLY); 
 
            ResultSet result = stmt.executeQuery(
                                  "SELECT * FROM t_message");
            result.afterLast(); 
            
            while(result.previous()) { 
                System.out.print(result.getInt("id") + "\t"); 
                System.out.print(result.getString("name") + "\t"); 
                System.out.print(result.getString("email") + "\t"); 
                System.out.println(result.getString("msg")); 
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
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
