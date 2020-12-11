package Arrays;

import java.util.Scanner;

public class UpperTriangleMatrix 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);  //scanner class
        int length = sc.nextInt(); //input length
        int [][] val = new int[length][length]; //console matrix values
        for(int i=0;i<val.length;i++) 
        {
            for(int j=0;j<val.length;j++) //for reading input values
            {
                val[i][j]=sc.nextInt();
            }
            
        }
        System.out.println("upper triangular matrix");
        for(int i=0;i<val.length;i++) 
        {
            for(int j=0;j<val.length;j++) 
            {
                if(j<i) //checking the index values 
                {
                    System.out.print("0 "); //if the condition is true then the value is replace by 0
                }
                else
                {
                    System.out.print(val[i][j]+" "); // prints the remaining matrix
                }
            }
            System.out.println();
            
        }
        sc.close();

        
    }
    
}
