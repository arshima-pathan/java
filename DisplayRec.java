import java.sql.*;
public class DisplayRec 
{
     public static void main(String args[])
     {
         Connection con;
         Statement st;
         ResultSet rs;
         try
         {
             con=DriverManager.getConnection("JDBC:mysql://localhost:3306/arshima","root","");
             st=con.createStatement();
             rs=st.executeQuery("Select *from student");
             while(rs.next())
             {
                 System.out.println("Emp no="+rs.getInt(1));
                 System.out.println("Emp name="+rs.getString(2));
             }
             con.close();
         }
         catch(Exception e)
         {
             System.out.println(e);
         }
     }
}
