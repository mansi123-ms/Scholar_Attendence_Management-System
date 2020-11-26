package supporting_classes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DatabaseConnection {
    public static Connection getConnection()
    {
        String driver="com.mysql.jdbc.Driver";
        String url="jdbc:mysql://localhost:3306/bunkercatcher";
        String userName="root";
        String password="12345";
        Connection con = null;
        try {
            Class.forName(driver);
            con=DriverManager.getConnection(url, userName, password);
        } catch (ClassNotFoundException | SQLException ex) 
        {

        }
        return con;
    }
  
}
