package Arrays;
import java.util.*;//package for scanner class
public class TwoMatricesEqual
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in); // scanner class
        int rows=sc.nextInt(); // rows and columns notations
        int columns=sc.nextInt();
        int rows1=sc.nextInt();
        int column1=sc.nextInt();
        int arr1[][]=new int[rows][columns]; // arrays notations
        int arr2[][]=new int[rows1][column1];
        for(int i=0;i<rows;i++) // storing the matrix 1 values in an array
        {
            for(int j=0;j<columns;j++)
            {
               arr1[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<rows1;i++) // storing the matrix 2 values in an array
        {
            for(int j=0;j<column1;j++)
            {
                arr2[i][j]=sc.nextInt();
            }
        }
        boolean flag=true;
        if(rows!=rows1 ||columns!=column1) //if rows and columns are not equal for different matrices then print matrices are not equal
        {
            System.out.println("Matries are not equal");
        }
        else{

          for(int i=0;i<rows;i++) // for loop for rows
          {
            for(int j=0;j<columns;j++) // for loop for column
            {
                if(arr1[i][j]!=arr2[i][j]) //if first matrix is not equal to second matrix then make flag as flag and break
                {
                    flag=false;
                    break;
                }
            }
        }
        if(flag) //if the flag becomes flag then print the matrices are equal 
        {
            System.out.println("Matrices are equal");
        }
        else{ // else print matrices are not equal
            System.out.println("Matrices are not equal");
        }
    }
    sc.close(); //scanner close
}
}
