package Arrays;

import java.util.Scanner;

public class SumofRowsandColumn 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);     //scanner class 
        int rows = scan.nextInt();                  
        int columns = scan.nextInt();                   
        int matrix[][] = new int[rows][columns];            
        int rowsum,colSum;                     

        
        for(int i= 0; i < rows; i++)
        {
            for(int j = 0; j < columns; j++)
            {
               
                matrix[i][j] = scan.nextInt();    //reading matrix elements 
            }
        }

        
        for(int i = 0; i < rows; i++)
        {
            rowsum = 0;
            colSum = 0;
            for(int j = 0; j < columns; j++)
            {
              
                rowsum = rowsum +matrix[i][j];    //rows sum 
                
                colSum =colSum + matrix[j][i];    //columns sum 
            }
            System.out.println("The sum of " +i +" "+"row is : " +rowsum);  //prints the rows sum
        System.out.println("The sum of " +i +" " +"column is :" +colSum);  //prints the columns sum
            System.out.println();
            scan.close();  
            
        }
                    
        
    }
    
}
