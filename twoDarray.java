import java.util.*;

public class twoDarray
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of rows:");
        int rows=sc.nextInt();
        System.out.println("Enter no of columns:");
        int columns=sc.nextInt();
        int[][] numbers=new int[rows][columns];
        System.out.println("Enter elements:");

        //input  rows
        for(int i=0;i<rows;i++)
        {
            //input columns
            for(int j=0;j<columns;j++)
            {
                numbers[i][j]=sc.nextInt();
            }
        }
        //output
        System.out.println("The matrix is:");
        for(int i=0;i<rows;i++)
        {
            //input columns
            for(int j=0;j<columns;j++)
            {
                System.out.print(numbers[i][j]+" ");
            }
            System.out.println();
        }
    
    }
}