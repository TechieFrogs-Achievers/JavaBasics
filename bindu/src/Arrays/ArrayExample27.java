package Arrays;

import java.util.Scanner;

public class ArrayExample27 
{
    public static void main(String[] args)  
    {
        System.out.println("Enter the elements:");
        Scanner sc = new Scanner(System.in);    //scanner class object
        int rows = sc.nextInt();         //initializing the rows 
        int column = sc.nextInt();         //initialzing the columns 
        int arr[][] = new int[rows][column]; //initializing the array to store the elements
        //loop that checks the array elements 
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<column;j++)
            {
                arr[i][j] =sc.nextInt();  //reads the elements
            }
        }
        boolean flag = true;   //boolean value 
        if(rows!=column)     //condition
        {
            System.out.println("matrix should be a square matrix");
        }
        else
        {
            for(int i=0;i<rows;i++)
            {
                for(int j=0;j<column;j++)
                {
                    if(i==j && arr[i][j]!=1)    //condition to check the matrix if it is equal then flag is false
                    {
                        flag=false;
                        break;
                    }
                    if(i!=j && arr[i][j]!=0)
                    {
                        flag=false;
                        break;
                    }
                }
            }
            if(flag)
            {
                System.out.println("matrix is identity matrix:");   //prints the identity matrix if condition is true
            }
            else
            {
                System.out.println("matrix is not an identity matrix:");   //prints if it is false
            }
            sc.close(); //scanner close
        }
        
        
    }
    
}
