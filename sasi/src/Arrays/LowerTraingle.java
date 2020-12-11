package Arrays;

import java.util.Scanner;

public class LowerTraingle
 {
        public static void main(String[] args) 
        {
            System.out.println("Enter the elements:");
            Scanner sc = new Scanner(System.in);  //scanner class object
            int row = sc.nextInt();  //initializing the row
            int column = sc.nextInt();    //initializing the column
            int n[][] = new int[row][column];  //initializing the array to store the elements 
            for(int i=0;i<n.length;i++)
            {
                for(int j=0;j<n.length;j++)
                {
                    n[i][j]=sc.nextInt();  //reads the array elements
                }
            }
            System.out.println("the lower triangular index is:");
            for(int i=0;i<n.length;i++)
            {
                for(int j=0;j<n.length;j++)
                {
                    if(j>i)  //condition to check the index values
                    {
                        System.out.print("0 ");  //prints 0 if the value of j is greater then i  
                    }
                    else
                    {
                        System.out.print(n[i][j]+" ");  //prints the matrix 
                    }
                }
                System.out.println();
                  
            }
            
            sc.close(); //scanner close
            
        }
        }

