class A1 implements Runnable
{
    public void run()
    {
        System.out.println("Hello Testing...");
    }
}
public class ThreadDemo2
{
    public static void main(String args[]) 
    {
        A a1=new A();
        Thread t1=new Thread(a1);
        t1.start();
    }
}