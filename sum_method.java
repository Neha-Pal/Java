import java.util.Scanner;

class sum_method
{
    static void addNumber()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st number:");
        int a=sc.nextInt();
        System.out.println("Enter 2nd number:");
        int b=sc.nextInt();
        // int a=78;
        // int b=90;
        int sum=a+b;
        System.out.println("Sum is:"+sum);
    }
    public static void main(String args[])
    {
        addNumber();
    }
}