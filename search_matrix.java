import java.util.Scanner;

public class search_matrix {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no of rows:");
        int r=sc.nextInt();
        System.out.print("Enter no of columns:");
        int c=sc.nextInt();
        int [][] m=new int [r][c];
        System.out.println("Elements are:");
        //input rows
        for(int i=0;i<r;i++)
        {
            //input columns
            for(int j=0;j<c;j++)
            {
                m[i][j]=sc.nextInt();
            }
        }
        //output
        System.out.println("The matric is:");
        for(int i=0;i<r;i++)
        {
            //input columns
            for(int j=0;j<c;j++)
            {
                System.out.print(m[i][j]+" ");
            }
            System.out.println(" ");
        }
        //element that I want to search
        System.out.print("Enter the search element:");
        int x=sc.nextInt();
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                //compare with x
                if(m[i][j]==x)
                {
                    System.out.print(x+" is found at the location:("+ i+", "+ j+")");
                }
            }
        }
    }
    
}
