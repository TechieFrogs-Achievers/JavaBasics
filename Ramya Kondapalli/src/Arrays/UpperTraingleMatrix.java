package Arrays;

import java.util.Scanner;

public class UpperTraingleMatrix {
    public static void main(String[] args) {

        int row=3,column = 3;
        int[][] arr = new int[row][column];  //declaring new array

        Scanner s = new Scanner(System.in);

        for(int i=0;i<row;i++){
            for (int j=0;j<column;j++){

                arr[i][j] = s.nextInt();
            }
        }
        s.close();
        
        //displaying the entered matrix
        System.out.println("The given matrix is : ");

        for(int i=0;i<row;i++){

            for (int j=0;j<column;j++){

                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        if (row != column){
            System.out.println("Matrix is not a Square matrix");
        }
        //code for upper traiangle matrix
        else{
            for (int i=0;i<arr.length;i++){

                for(int j=0;j<arr.length;j++){

                    if(i > j)
                        arr[i][j] = 0 ;
                    
                }
            }
        }
        System.out.println("The resultant matrix : ");
        for(int i=0;i<row;i++){
            for (int j=0;j<column;j++){

                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
