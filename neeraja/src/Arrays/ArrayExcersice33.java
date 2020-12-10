package Arrays;

import java.util.Scanner;

//program to print product of two matrices
public class ArrayExcersice33 {
    public static void main(String[] args){
        //declaration of arrays
        int arr1[][] = new int[3][3];
        int arr2[][] = new int[3][3];
        int product[][] = new int[3][3];
        Scanner sc = new Scanner(System.in);

        System.out.println("first array elements : ");
        //initializing first array elements 
        for(int i =0; i <3 ; i++) {
            for(int j=0;j<3;j++) {
                arr1[i][j] = sc.nextInt();
            }
        }
        //initializing  second array from keyboard
        System.out.println("enter elements of second array : ");
         for(int i = 0; i <3 ; i++)
         {
             for(int j = 0; j<3 ; j++)
             {
                 arr2[i][j] =sc.nextInt();
             }
         }

        System.out.println("first array : ");
        //printing first matrix
        for(int i = 0; i <3 ; i++)
         {
             for(int j = 0; j<3 ; j++) {
               System.out.print( arr1[i][j] +" ");
             }
             System.out.println();
         }

         System.out.println("second array : " );
        //printing second matrix
        for(int i = 0; i <3 ; i++) {
           for(int j = 0; j<3 ; j++){
                 System.out.print( arr2[i][j] +" ");
             }
             System.out.println();
         }   

         //product of two matrices 
         System.out.println("product of two matrices");
        for(int i =0 ; i <3; i++){
             for(int j =0; j<3 ;j++){ 
                 product[i][j]=0;
                 for(int k =0;k <3 ; k++) {
                    product[i][j] = arr1[i][k] * arr2[k][j];
                 } 

                 System.out.print(product[i][j] + " ");
             }
             System.out.println();
         }
        sc.close();

    }
    
}
