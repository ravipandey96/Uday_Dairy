import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Vector;

public class DC1 {
  String query=null;
 Statement st=null;
 
 public DC1(String qry) {
       query=qry;
    }

 public Vector getData()throws Exception
{  
    Vector<Vector<String>> cVector = new Vector<Vector<String>>();

Connection con = re.getCon();
st=con.createStatement();

ResultSet rs = st.executeQuery(query);

while(rs.next())
{
Vector<String> custVet = new Vector<String>();
custVet.add(rs.getString(1)); //Empid
custVet.add(rs.getString(2)); //name
custVet.add(rs.getString(3)); //position
custVet.add(rs.getString(4)); //department
custVet.add(rs.getString(5)); //name
//custVet.add(rs.getString(6)); 
//custVet.add(""+rs.getFloat(6));
//custVet.add(""+rs.getFloat(7));

cVector.add(custVet);
}
if(con!=null)
con.close();

return cVector;
}
}