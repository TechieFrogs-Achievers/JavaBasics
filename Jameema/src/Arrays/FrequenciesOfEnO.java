package Arrays;

import java.util.Scanner;

public class FrequenciesOfEnO 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);  //scanner class
        
        int rows = scan.nextInt();
        int columns = scan.nextInt();
        
        int matrix[][] = new int[rows][columns];
        for(int i = 0; i < rows; i++)
        {
            for(int j = 0; j < columns; j++)
            {
                matrix[i][j] = scan.nextInt();  //input matrix
            }
        }
        int evenNbrs = 0, oddNbrs = 0;  //initilaize as zero
        
        for(int i = 0; i < rows; i++)
        {
            for(int j = 0; j < columns; j++)
            {
                
                if(matrix[i][j] % 2 == 0)  //checking for even numbers
                {
                    
                    evenNbrs++;
                }
                
                else if(matrix[i][j] != 0)  //checking for odd numbers
                {
                   
                    oddNbrs++;
                }
            }
        }
        //printing there frquencies
        System.out.println("The frequency of even numbers is : " +evenNbrs);
        System.out.println("The frequency of odd numbers is : " +oddNbrs);
        scan.close();           
        
    }
    
}
