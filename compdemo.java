
class company
{
    int ccode;
    String cname;
    
    void getcmp(int code,String name)
    {
        ccode=code;
        cname=name;
    }
}
class Emp1 extends company
{
    int id;
    String name;
    float salary;
    
    void getEmp(int id,String n,float sal)
    {
        id=id;
        name=n;
        salary=sal;
    }
    void show()
    {
        System.out.println();
        System.out.println("--Details of company--");
        System.out.println("company code: "+ccode);
        System.out.println("company name: "+cname);
        System.out.println("employee id: "+id);
        System.out.println("company name: "+name);
        System.out.println("company salary: "+salary);
    }
}
public class compdemo 
{
    public static void main(String args[])
    {
      Emp1 e1= new Emp1(); 
      Emp1 e2= new Emp1 (); 
      
      e1.getcmp(201,"tcs");
      e2.getcmp(202,"relience");
      
      e1.getEmp(01,"Arshima",70000);
      e2.getEmp(01,"Tanvi",60000);
      
      e1.show();
      e2.show();
    }
}
