import java.sql.*;
import java.util.Vector;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author RAVI
 */
public class bill {
     String query=null;
 Statement st=null;
 public bill(String qry) {
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
custVet.add(rs.getString(6)); 
custVet.add(rs.getString(7));
//custVet.add(""+rs.getInt(8));

cVector.add(custVet);
}
if(con!=null)
con.close();

return cVector;
}
}
