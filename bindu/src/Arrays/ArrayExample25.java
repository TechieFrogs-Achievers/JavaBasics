package Arrays;

import java.util.Scanner;

public class ArrayExample25 
{
    public static void main(String[] args) 
    {
        System.out.println("Enter the Elements:");
        Scanner sc = new Scanner(System.in);   //scanner class object
        int rows = sc.nextInt();  //initializing the rows 
        int columns = sc.nextInt(); //initializing the columns
        int Transpose[][] = new int[rows][columns];   //stores the elements of rows and columns
        for(int i=0;i<rows;i++)   //reads the rows 
        {
            for(int j=0;j<columns;j++)   //reads the columns
            {
                Transpose[i][j]=sc.nextInt();  //reads the rows and columns
            }
        }
        System.out.println("transpose of matrix is:");
        for(int i=0;i<rows;i++)   
        {
            for(int j=0;j<columns;j++)
            {
                System.out.print(Transpose[j][i]+" ");  //prints the transpose matrix 
            }
            
            System.out.println();
            
        }
        sc.close();   //scanner close

        
    }

    
}
