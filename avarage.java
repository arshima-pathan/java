import java.util.*;
public class avarage 
{
     public static void main(String args[])  
  {
      int a,b,c;
      float avg;
      Scanner Sc=new Scanner(System.in);
      System.out.println("Enter A: ");
      a=Sc.nextInt();
      System.out.println("Enter B: ");
      b=Sc.nextInt();
      System.out.println("Enter C: ");
      c=Sc.nextInt();
      
      avg=(a+b+c)/3;
      System.out.println("avarage="+avg);
  }   
}
