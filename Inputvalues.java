import java.util.*;
public class Inputvalues 
{
    public static void main (String args[])
    {
        int a;
        float b;
        double c;
        String s1;
        Scanner Sc=new Scanner (System.in);
        System.out.println("enter int value:");
        a=Sc.nextInt();
        System.out.println("enter float value:");
        b=Sc.nextFloat();
        System.out.println("enter double value:");
        c=Sc.nextDouble();
        System.out.println("enter String value:");
        s1=Sc.next();
        
        System.out.println("\nvalue of a="+a);
        System.out.println("\nvalue of b="+b);
        System.out.println("\nvalue of c="+c);
        System.out.println("\nvalue of s1="+s1);
    }
}
