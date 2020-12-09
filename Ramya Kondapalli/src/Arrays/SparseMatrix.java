package Arrays;

import java.util.Scanner;

public class SparseMatrix {
    public static void main(String[] args) {
        
        Scanner s= new Scanner(System.in);

        int rows = 3,columns =3,count =0;
        int[][] arr = new int[rows][columns];
        int size = rows * columns;

        //taking inputs from user
        for (int i =0;i<rows;i++){
            for(int j=0;j<columns;j++){
                
                arr[i][j] = s.nextInt();
            }
        }
        s.close();
        //displaying the given matrix
        System.out.println("The given matrix : ");
        for (int i =0;i<rows;i++){
            for(int j=0;j<columns;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        //code for calculating the number of zeros
        for(int i =0;i<rows;i++){
            for(int j=0;j<columns;j++){
                
                if(arr[i][j] == 0)
                    count++;
                else
                    continue;
            }
        }

        //if zeros count is greater than half array size 
        if(count>(size/2)){ 
            System.out.println("Matrix is Sparse matrix");
        }
        else 
            System.out.println("Matrix is Not sparse matrix");
    }
}
