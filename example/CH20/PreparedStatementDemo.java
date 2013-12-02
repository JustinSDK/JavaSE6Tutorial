package onlyfun.caterpillar;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;

public class PreparedStatementDemo {
    public static void main(String[] args) {
        DBSource dbsource = null;
        Connection conn = null;
        PreparedStatement stmt = null;
        try {
            dbsource = new SimpleDBSource();
            conn = dbsource.getConnection();
            
            stmt = conn.prepareStatement(
                    "INSERT INTO t_message VALUES(?, ?, ?, ?)");
            
            stmt.setInt(1, 2);
            stmt.setString(2, "momor");
            stmt.setString(3, "momor@mail.com");
            stmt.setString(4, "message2...");
            
            stmt.executeUpdate();
            stmt.clearParameters();
            
            stmt.setInt(1, 3);
            stmt.setString(2, "bush");
            stmt.setString(3, "bush@mail.com");
            stmt.setString(4, "message3...");
            
            stmt.executeUpdate();
            stmt.clearParameters();

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
