import java.sql.*;
public class Insertprepare 
{
    public static void main(String args[])
    {
        Connection con;
        PreparedStatement pst;
        try
        {
            con=DriverManager.getConnection("JDBC:mysql://localhost:3306/arshima","root","");
            pst=con.prepareStatement("insert into student values(?,?)");
            int n;
            pst.setInt(1,4);
            pst.setString(2,"jhanvi");
            n=pst.executeUpdate();
            System.out.println(n + "record inserted..");
            con.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
