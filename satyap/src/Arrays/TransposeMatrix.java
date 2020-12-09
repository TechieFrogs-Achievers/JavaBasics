package Arrays;
import java.util.*;
public class TransposeMatrix // class for transpose matrix for changing rows and columns
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in); //scanner class
        int length=sc.nextInt();
        int arr[][]=new int[length][length]; // array notation
        for(int i=0;i<arr.length;i++) // for loop for storing elements
        {
            for(int j=0;j<arr.length;j++)
            arr[i][j]=sc.nextInt();
        }
        int transpose[][]=new int[length][length];
        for(int i=0;i<arr.length;i++) // for loop for transposing matrix
        {
            for(int j=0;j<arr.length;j++)
            {
            transpose[i][j]=arr[j][i];
            }
        }
        for(int i=0;i<arr.length;i++) //printing transpose matrix elements     
        {
            for(int j=0;j<arr.length;j++)
            {
               System.out.print(transpose[i][j]+" ");
            }
        }
        sc.close();//scanner class
    }
}
