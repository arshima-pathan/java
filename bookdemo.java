class book
{
    String title;
    int price;
    
    void getbook(String ti,int pr)
    {
        title=ti;
        price=pr;
    }
    
    void putbook()
    {
        System.out.println("book title:"+title);
        System.out.println("book price:"+price);
        System.out.println("");
        System.out.println("-----------------");
        System.out.println("");
    } 
}
public class bookdemo
{
   public static void main(String args[])
   {
       book b1=new book();
       book b2=new book();
       
       b1.getbook("GUNAHO KA DEVTA",350);
       b2.getbook("HARRYPOTTER",500);
       
       b1.putbook();
       b2.putbook();
       
   }
}
