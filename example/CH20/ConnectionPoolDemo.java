package onlyfun.caterpillar;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

public class ConnectionPoolDemo {
    public static void main(String[] args) {
        try {
            DBSource dbsource = new BasicDBSource("jdbc2.properties");
            Connection conn1 = dbsource.getConnection();
            dbsource.closeConnection(conn1);
            Connection conn2 = dbsource.getConnection();
            System.out.println(conn1 == conn2);
            
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
    }
}
