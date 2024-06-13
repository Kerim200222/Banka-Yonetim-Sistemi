package bank_management_system;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class javaconnect {
    public  Connection connection=null;
     public static Connection connecctDb(){
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/bank_management?UseUnicode=yes&characterEncoding=UTF-8","root","");
            return conn;
        }
        
        catch(ClassNotFoundException ex){
                System.out.println("Where is MySql Driver");
                ex.printStackTrace();
            }
        catch(SQLException e)
            {
            System.out.println("Connection Field");
            e.printStackTrace();
            }
        return null;
        
     }
}

