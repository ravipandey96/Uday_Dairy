
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class re {
    public static Connection getCon()
    {
        Connection con=null;
       
        try
         {
         // String database = "jdbc:ucanaccess://G:\\Billing_System//BILLING_SYSTEM.mdb";
							Class.forName("com.mysql.jdbc.Driver");
							con = DriverManager.getConnection("jdbc:mysql://localhost:3306/billing_system","root","123"); 
      /*    Class.forName("com.mysql.jdbc.Driver");
             con = (Connection)
            DriverManager.getConnection("jdbc:mysql://localhost:3306/billing_system","root","123");
                 Statement stmt = con.createStatement();*/                                      

        }
        catch(Exception ex)
        {
System.out.println(ex);
        }
        return con;
    }

}
