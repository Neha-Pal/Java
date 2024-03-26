import java.util.*;

public class even_odd 
{
    public static void main(String args[]) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=sc.nextInt();
        if(num%2==0)
        {
            System.out.println("The number is even");
        }
        else 
        {
            System.out.println("The number is odd");
        }
    }
}
