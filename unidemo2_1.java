import java.util.*;
class University
{
    String uname,ucity;
    int tot_stud;
    
    void getuni()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter university name:");
        uname=sc.next();
        System.out.print("Enter university city:");
        ucity=sc.next();
        System.out.print("Enter total student:");
        tot_stud=sc.nextInt();
    }
}
class Department extends University
{
    int deptno;
    String deptname;
    
    void getdept()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter department no:");
        deptno=sc.nextInt();
        System.out.print("Enter department name:");
        deptname=sc.next();
    }
    void display()
    {
      System.out.println("university name:"+uname); 
      System.out.println("university city:"+ucity); 
      System.out.println("total student:"+tot_stud); 
      System.out.println("department no:"+deptno); 
      System.out.println("department name:"+deptname); 
    }
}
public class unidemo2_1 
{
    public static void main (String[] args)
    {
         Department d1=new Department(); 
         Department d2=new Department(); 
         System.out.println("Enter details for object 1");
         d1.getuni();
         d1.getdept();
         
         System.out.println("\nEnter details for object 2");
         d2.getuni();
         d2.getdept();
         
         System.out.println("\n Details of object 1");
         d1.display();
         
         System.out.println("\n Details of object 2");
         d2.display();
    }                   
}
