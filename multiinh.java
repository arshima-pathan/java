class university1
{
    void showuni()
    {
        System.out.println("atmiya university..");
    }
}
class department1 extends university1
{
    void showdept()
    {
        System.out.println("computer science..");
    }
}
class program extends department1
{
    void showprg()
    {
        System.out.println("Bsc.it");
    }
}
class multiinh 
{
  public static void main(String args[]) 
  {
      program p= new program();
      p.showuni();
      p.showdept();
      p.showprg();
  }
}

