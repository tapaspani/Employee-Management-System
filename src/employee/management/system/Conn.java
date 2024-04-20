
package employee.management.system;
import java.sql.*;

/**
 *
 * @author prate
 */
public class Conn {
    
    Connection c;
    Statement s;
    
  public Conn(){
      try{
          Class.forName("com.mysql.cj.jdbc.Driver");
          c=DriverManager.getConnection("jdbc:mysql:///employeemanagementsystem","root","prateek216");
          s=c.createStatement();
      } catch(Exception e)
      {
          e.printStackTrace();
      }
  }
    
    
}
