import java.sql.*;
public class DeleteRec 
{
     public static void main(String args[])
    {
       Connection con;
       Statement st;
       try
       {
           con=DriverManager.getConnection("JDBC:mysql://localhost:3306/arshima","root","");
           st=con.createStatement();
           int n;
           n=st.executeUpdate("delete from student where stud_id=1");
           System.out.println(n + "record deleted..");
           con.close();
       }
       catch (Exception e)
       {
           System.out.println(e);
       }
    }
}
