import java.util.*;
public class factorial {
    public static void printFactorial(int n)
    {
        int fac=1;
        for(int i=n;i>=1;i--)
        {
            fac=fac*i;
        }
        System.out.println(fac);
        return;
    }
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter number:");
        int n=sc.nextInt();
        System.out.printf("factorial of %d is:",n);
        printFactorial(n);
    }
    
}
