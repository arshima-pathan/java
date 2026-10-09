import java.sql.*;
public class JDBC 
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
           n=st.executeUpdate("insert into student values(1,'arshi')");
           System.out.println(n + "record inserted..");
           con.close();
       }
       catch (Exception e)
       {
           System.out.println(e);
       }
               
    }
    
}
