import java.util.Scanner;

class Prime {
    void Pn(int x)
    {
        int i,p=1;
        for(i=2;i<x;i++)
        {
            if(x%i==0)
            {
                p=0;break;
            }
        }
        if(p==1)
        {
            System.out.println(x+" is prime");
        }
        else{
            System.out.println(x+" is not prime..");
        }
    }
}
class main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number:");
        int x=sc.nextInt();
        Prime a=new Prime();
        a.Pn(x);
    }
}