package onlyfun.caterpillar;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StatementResultDemo {
    public static void main(String[] args) {
        DBSource dbsource = null;
        Connection conn = null;
        Statement stmt = null;
        try {
            dbsource = new SimpleDBSource();
            conn = dbsource.getConnection();
            
            stmt = conn.createStatement(); 

            stmt.executeUpdate(
               "INSERT INTO t_message VALUES(1, 'justin', " +
               "'justin@mail.com', 'mesage...')");
 
            ResultSet result = stmt.executeQuery(
                                  "SELECT * FROM t_message"); 
            while(result.next()) { 
                System.out.print(result.getInt(1) + "\t"); 
                System.out.print(result.getString(2) + "\t"); 
                System.out.print(result.getString(3) + "\t"); 
                System.out.println(result.getString(4)); 
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
