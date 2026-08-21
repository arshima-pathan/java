class RectArea
{
    int length,width;
    RectArea(int ln,int wi)
    {
        length=ln;
        width=wi;
    }
     void Area()
    {
        System.out.println("Rectangle Area="+(length*width));
    }
}
public class RectAreaDemo
{
    public static void main(String args[])
    {
        RectArea r1=new  RectArea(25,5);
        r1.Area();
    }
}
