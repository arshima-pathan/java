import java.util.*;
public class oddeven
{
 public static void main(String args[])   
 {
     int n;
     Scanner Sc=new Scanner(System.in);
     System.out.println("enter value:");
     n=Sc.nextInt();
     
     if(n%2==0)
         System.out.println("Number is even");
     else
         System.out.println("Number is odd");
         
 }
}
