 
package resturants;
import java.sql.*;
import javax.swing.*; 

public class Sqlite {
    

  Connection conn=null;
    public static Connection ConnecrDB()   {
       try{
        Class.forName("org.sqlite.JDBC");
         Connection conn=DriverManager.getConnection("jdbc:sqlite:Resturant.sqlite");
         
         //JOptionPane.showMessageDialog(null, "Connected");
         return conn;
       }catch(Exception e){
           JOptionPane.showMessageDialog(null, "Not Connected");
           return null;
       }
    }


    
}
