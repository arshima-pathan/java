abstract class shape
{
    abstract void draw();    
}
class circle extends shape
{
    void draw()
    {
        System.out.println("draw circle");
    }
}
class rectangle extends shape
{
    void draw()
    {
        System.out.println("draw Rectangle.. ");
    }
}
public class absdemo 
{
   public static void main(String args[])
   {
       shape s;//refrence variable of base class
       circle c1=new circle();
       rectangle r1=new rectangle();
       s=c1;  //upcasting
       s.draw();
   }
}
