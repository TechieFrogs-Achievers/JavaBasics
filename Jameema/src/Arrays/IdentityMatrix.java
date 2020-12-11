package Arrays;

import java.util.Scanner;



public class IdentityMatrix {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int length =sc.nextInt();
        int[][] identity = {{1,0,0},{0,1,0},{0,0,1}};
        int[][] mat = new int[length][length];
        int i;
        int j;
        for( i=0;i<length;i++) 
        {
            for( j=0;j<length;j++) //for reading input values
            {
                mat[i][j]=sc.nextInt(); //matrix1
            }
            
        }
       // boolean flag=true;
        for(i=0;i<length;i++) 
        {
            for(j=0;j<length;j++) 
            {
                if(mat[i][j]==identity[i][j])
                {
                   System.out.print("given matrix is identity matrix");
                   //flag=true;

                }
                else
                {
                    System.out.print("given matrix is not identity matrix");
                }     
            }
            System.out.println();
            
        }
        // if(flag)
        // {
        //     System.out.println("given matrix is identity matrix");

        // }
        // else
        // {
        //     System.out.println("given matrix is  not identity matrix");

        // }
        sc.close();
    }
    
}
