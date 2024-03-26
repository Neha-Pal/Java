import java.util.Scanner;

public class marks {
    public static void main(String args[])
    {
        System.out.println("Let's check the percentage of board exam.......");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the marks of Physics:");
        int P=sc.nextInt();
        System.out.println("Enter the marks of Chemistry:");
        int C=sc.nextInt();
        System.out.println("Enter the marks of Math:");
        int M=sc.nextInt();
        float s=P+C+M;
        float result=(s/300)*100;
        System.out.print("The percentage of your exam is:"+result);
        System.out.print("%");

    }
    
}
