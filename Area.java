import java.util.Scanner;

public class Area {
    int r;
    void area(int r)
    {
        double result_1=3.14*r*r;
        System.out.println("Area of a circle is:"+result_1);
    }
    void area(int l,int b)
    {
        double result_2=l*b;
        System.out.println("Area of a rectangle is:"+result_2);
    }
    
}
class main
{
    public static void main(String args[])
     {
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the radious of the circle:");
        a=sc.nextInt();
        System.out.println("Enter length of the rectangle:");
        b=sc.nextInt();
        System.out.println("Enter the breath of the rectangle:");
        c=sc.nextInt();
        Area ar=new Area();
        ar.area(a);
        ar.area(c, b);

    }
}
