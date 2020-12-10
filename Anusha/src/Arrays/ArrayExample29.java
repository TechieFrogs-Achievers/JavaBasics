package Arrays;
import java.util.*;
public class ArrayExample29 
{
    public static void main(String[] args) 
    {
        int row1, col1, row2, col2,i,j;    
        boolean flag = true; 
        int a[][]= new int[3][3]; 
        int b[][]=new int[3][3];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter matrix elements:");
        for(i=0;i<3;i++)//enter the elements into an array
        {
            for(j=0;j<3;j++)
            {
                System.out.println("Enter number in ["+i+"]["+j+"]");
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter matrix elements:");
        for(i=0;i<3;i++)//enter the elements into an array
        {
            for(j=0;j<3;j++)
            {
                System.out.println("Enter number in ["+i+"]["+j+"]");
                b[i][j]=sc.nextInt();
            }
        } 
        System.out.println("Matrix is........");
        for(i=0;i<3;i++)//print the matrix
        {
            for(j=0;j<3;j++)
            {
                System.out.print(a[i][j]+" ");
                
            }
            System.out.println();
        } 
        System.out.println("Matrix is........");
        for(i=0;i<3;i++)//print the matrix
        {
            for(j=0;j<3;j++)
            {
                System.out.print(b[i][j]+" ");
                
            }
            System.out.println();
        }

        //Calculates the number of rows and columns present in the first matrix    
    
        row1 = a.length;    
        col1 = a[0].length;    
            
        //Calculates the number of rows and columns present in the second matrix    
    
          row2 = b.length;    
        col2 = b[0].length;    
            
        //Checks if dimensions of both the matrices are equal    
        if(row1 != row2 || col1 != col2){    
            System.out.println("Matrices are not equal");    
        }    
        else {    
            for( i = 0; i < row1; i++){    
                for( j = 0; j < col1; j++){    
                  if(a[i][j] != b[i][j]){    
                      flag = false;    
                      break;    
                  }    
                }    
            }    
                
            if(flag) //check condition for equal matrix   
                System.out.println("Matrices are equal");    
            else    
                System.out.println("Matrices are not equal");    
        }
    }
}
