class emp
{
    int id;
    String name;
    void getemp(int n,String nm)
    {
        id=n;
        name=nm;
    }
  void putemp()
  {
      System.out.println("employee id="+id);
        System.out.println("employee name="+name);
  }
    
}
public class empdemo 
{
  public static void main(String args[])
  {
     emp e1=new emp(); 
     emp e2=new emp(); 
     e1.getemp(1,"arshima");
     e2.getemp(2,"tanvi");
     e1.putemp();
     System.out.println("--------");
     e2.putemp();
  }
}
