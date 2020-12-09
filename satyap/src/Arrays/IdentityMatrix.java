package Arrays;
import java.util.*;
public class IdentityMatrix  // class for printing  identity matrix
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);//scanner class
        int rows=sc.nextInt(); //array notation
        int columns=sc.nextInt();
        int arr[][]=new int[rows][columns];
        for(int i=0;i<rows;i++) //for loop for storing array elements
        {
            for(int j=0;j<columns;j++)
            {
            arr[i][j]=sc.nextInt();
            }
        }
        boolean flag=true;
        if(rows!=columns) //if loop for condition for rows and columns are equal or not
        {
            System.out.println("Martrix should be a square matrix");
        }
        else{ //if the cond is false then check the another cond aswell
            for(int i=0;i<rows;i++)
            {
                for(int j=0;j<columns;j++)
                {
                    if(i==j && arr[i][j]!=1) // if lengths are diff and elements are not equal the print non identity matrices
                    {
                        flag=false;
                        break;
                    }
                    if(i!=j && arr[i][j]!=0) //if lengths are diff and elements are not equal then print non identity matrix
                    {
                        flag=false;
                        break;
                    }
                }
                
            }

        if(flag)// if flag is true then print identity matrix
        {
            System.out.println("Given matrix is Identity matrix");
        }
         else{//if flag value is false then print not identity matrix
            System.out.println("Given matrix is not an indentity matrix");
        }
         sc.close();//scanner close
    }
        

    }
}
