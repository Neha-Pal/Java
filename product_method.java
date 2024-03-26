import java.util.Scanner;

public class product_method {
    public static void Calculate_product()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two number:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int product=a*b;
        System.out.println("The product of this two number is:"+product);
    }
    public static void main(String args[])
    {
        Calculate_product();
    }
}
