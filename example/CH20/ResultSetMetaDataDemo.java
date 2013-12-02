package onlyfun.caterpillar;
 
import java.io.IOException;
import java.sql.*; 
 
public class ResultSetMetaDataDemo { 
    public static void main(String[] args) {
        DBSource dbsource = null;
        Connection conn = null;
        Statement stmt = null;

        try { 
            dbsource = new SimpleDBSource();
            conn =  dbsource.getConnection();
 
            stmt = conn.createStatement(); 
            ResultSet result = stmt.executeQuery(
                                  "SELECT * FROM t_message"); 
            ResultSetMetaData metadata = 
                                  result.getMetaData(); 
 
            for(int i = 1; 
                i <= metadata.getColumnCount(); 
                i++) { 

                System.out.print(
                        metadata.getTableName(i) + "."); 
                System.out.print(
                        metadata.getColumnName(i) + "\t|\t"); 
                System.out.println(
                        metadata.getColumnTypeName(i)); 
            } 
        } 
        catch(SQLException e) { 
            e.printStackTrace(); 
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
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