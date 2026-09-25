class employee
{
    int id,salary;
    String name,city;
    void getemp(int n,String nm,int s1, String ct)
    {
        id=n;
        name=nm;
        salary=s1;
        city=ct;
    }
  void putemp()
  {
      System.out.println("employee id="+id);
        System.out.println("employee name="+name);
        System.out.println("salary="+salary);
        System.out.println("city="+city);
  }
    
}
public class empdemo 
{
  public static void main(String args[])
  {
     employee e1=new employee(); 
     employee e2=new employee(); 
     e1.getemp(1,"arshima",80000,"rajkot");
     e2.getemp(2,"tanvi",80000,"rajkot");
     e1.putemp();
     System.out.println("--------");
     e2.putemp();
  }
}
