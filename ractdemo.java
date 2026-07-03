class ractangle
{
    float length;
    float width;
    void getdata(float len,float wid)
    {
        length=len;
        width=wid;
    }
    float area()
    {
        float ans;
        ans=length*width;
        return ans;
    }
}
public class ractdemo 
{
   public static void main (String args[])
   {
       ractangle r1=new ractangle();
       r1.getdata(20.5f,56.34f);
       System.out.println("area of ractangle="+r1.area());
   }
}
