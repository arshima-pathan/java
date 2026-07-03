import java.util.*;
public class switchdemo
{
    public static void main(String args[])
    {
        int a,b,ch;
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter value1:");
        a=Sc.nextInt();
        System.out.println("Enter value2:");
        b=Sc.nextInt();
        System.out.println("\t 1.add");
        System.out.println("\t 2.sub");
        System.out.println("\t 3.mul");
        System.out.println("\t 4.Div");
        System.out.println("\t Enter your choice:");
        ch=Sc.nextInt();
        switch(ch)
        {
            case 1:
            System.out.println("Sum="+(a+b));
            break;
            
            case 2:
            System.out.println("Sub="+(a-b));
            break;
            
            case 3:
            System.out.println("mul="+(a*b));
            break;
            
            case 4:
            System.out.println("Div="+(a/b));
            break;
            
            default:
            System.out.println("Invalid no.");
            
        }      
    }
}
