package Arrays;

import java.util.Scanner;

//program to find substractin of a matrixx
public class ArrayExcersice26 {
    public static void main(String []k){
//FIRST ARRAY TO PERFORM SUBSTRACTION OPERATION
        //declaration of an array
        int[] []a=new int[3][3];
        Scanner scan=new Scanner(System.in);

        //initializing an array 
        for(int i=0; i<a.length; i++){
            for(int h=0; h<a.length; h++){
                a[i][h]=scan.nextInt();
            }
        }
        //displaying the initialized array
        System.out.println("MATRIX ONE:");
         for(int i=0; i<a.length; i++){
            for(int h=0; h<a.length; h++){
            System.out.print(a[i][h]+" ");
            }
            System.out.println();
        }

 //SECOND ARRAY TO PERFORM SUBSTRACTION OPERATION
        //declaration of an second array
        int[] []b=new int[3][3];

        //initializing an array 
        for(int i=0; i<b.length; i++){
            for(int h=0; h<b.length; h++){
                b[i][h]=scan.nextInt();
            }
        }
        //display the initialized array
        System.out.println("MATRIX TWO:");
         for(int i=0; i<b.length; i++){
            for(int h=0; h<b.length; h++){
            System.out.print(b[i][h]+" ");
            }
            System.out.println();
        }
        scan.close();
//logic to perform substracton operation
       //declaring another matrix to strore resultant matrix
       int[][] result=new int[3][3];

       for(int i=0; i<b.length; i++){
        for(int h=0; h<b.length; h++){
            result[i][h]=a[i][h]-b[i][h];//logic to perform substraction of two matrices
        }
        System.out.println();
    }

    //displays resultant matrixxx
    System.out.println("RESULTANT MATRIX:");
    for(int i=0; i<b.length; i++){
        for(int h=0; h<b.length; h++){
        System.out.print(result[i][h]+" ");
        }
        System.out.println();
    }


    }
    
}
