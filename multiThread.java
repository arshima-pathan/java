class A3 extends Thread
{
    public void run()
    {
        for (int i=1;i<=5;i++)
        {
            System.out.println("from A...i="+i);
        }
    }
}
class B extends Thread
{
   public void run()
   {
       for (int j=1;j<=5;j++)
       {
           System.out.println("from B...j="+j);
       }
   }
}
public class multiThread 
{
    public static void main(String args[]) 
    {
        A a1=new A();
        B b1=new B();
        a1.start();
        b1.start();
    }
}
