
import java.util.*;

class AreaCal {
    void areaOfCircle(int r)
    {
        double a;
        a=3.14*r*r;
        System.out.println("Area is:"+a);
    }
    
}
class main{
    public static void main(String args[])

    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Radious:");
        int r=sc.nextInt();
        AreaCal obj;
        obj=new AreaCal();
        obj.areaOfCircle(r);

    }
}
