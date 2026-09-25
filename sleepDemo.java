class A4 extends Thread
{
    public void run()
    {
        for (int i=1;i<=5;i++)
        {
            System.out.println("from A...i="+i);
            try
            {
                Thread.sleep(9000);
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
    }
}    
public class sleepDemo 
{
    public static void main(String args[]) 
    {
        A a1=new A();
        a1.start();
    }
}
