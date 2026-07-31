class university
{
    void showuni()
    {
        System.out.println("atmiya university..");
    }
}
class department extends university
{
    void showdept()
    {
        System.out.println("computer science");
    }
}
 class singleinh 
{
   public static void main(String args[]) 
   {
       department d= new department();
       d.showuni();
       d.showdept();
   }
}
