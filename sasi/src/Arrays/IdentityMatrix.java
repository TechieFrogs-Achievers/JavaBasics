package Arrays;

import java.util.Scanner;

public class IdentityMatrix
 {
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in); //input user
        int row=sc.nextInt();//read row
        int col=sc.nextInt();//read col
        int arr[][]=new int[row][col]; //elem stores in arr
        for(int i=0;i<row;i++) //loop for row
        {
            for(int j=0;j<col;j++) //loop for col
            {
                arr[i][j]=sc.nextInt();//read the input of row&col
            }
        }
        boolean flag=true;
        if(row!=col)
        {
            System.out.println("matrix should be a square matrix:");
        }
        else
        {
           for(int i=0;i<row;i++)
           {
               for(int j=0;j<col;j++)
               {
                   if(i==j && arr[i][j]!=1)
                   {
                       flag=false;
                       break;
                   }
                   if(i!=j && arr[i][j]!=0)
                   {
                       flag =false;
                        break;
                   }
               }
           }
           if(flag)
           {
               System.out.println("Given matrix is identity:");
           }
           else
           {
               System.out.println("Given matrix is not an identity matrix ");
           }
           sc.close();
        }
    }
}
