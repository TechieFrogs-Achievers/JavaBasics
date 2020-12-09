import java.util.Scanner;

public class ArrayExample41
 {
    public static void main(String[] args)
     {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of rows");
        int a = sc.nextInt();//taking the number of rows from keyboard
        System.out.println("enter the number of rows");
        int b = sc.nextInt();//taking number of columns from keyboard
        int arr[][] = new int[a][b];//the array with length
        System.out.println("enter the elements in an array");
        for(int i=0; i<a; i++)
        {
            for(int j=0; j<b; j++)
            {
                arr[i][j]= sc.nextInt();
            }
        }
        System.out.println("the array elements are");
        for(int i=0; i<a; i++)
        {
            for(int j=0; j<b; j++)
            {
                System.err.print(arr[i][j]+" ");//printing the array with elements
            }
            System.out.println();
        }
        int[][] transpose = new int[b][a];//another array with length opposite to normal array
        for(int i=0; i<b; i++)
        {
            for(int j=0; j<a; j++)
            {
        
            transpose[i][j] = arr[j][i];//chananging the length orders of normal array
            }
        }
        System.out.println("the transpose matrix of a given matrix is");
        for(int i=0; i<b; i++)
        {
            for(int j=0; j<a; j++)
            {
                System.out.print(transpose[i][j]+" ");//transpose matrix for multidimensional arrays
            }
            System.out.println();
        }
        
        sc.close();
    }
}
