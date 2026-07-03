class value
{
    int a;
    void getvalue()
    {
        a=10;
    }
    void putvalue()
    {
        System.out.println("a="+a);
    }
}
public class valdemo
{
  public static void main(String args[])
  {
      value v1=new value();
      v1.getvalue();
      v1.putvalue();
  }
}
