package Arrays;

import java.util.Scanner;
//program to print lower triangular matrix
public class ArrayExcersice32 {
    public static void main(String[] o){
        
        //int[] []a={{9,8,7},{6,5,4},{3,2,1}};
        int [][]a=new int[3][3];
        Scanner scan=new Scanner(System.in);
        int rows=a.length;//counting no of rows
        int colum=a[0].length;//counting no of coloumns

        System.out.println("enter array elements:");
         //initializing an array 
         for(int i=0; i<a.length; i++){
            for(int h=0; h<a.length; h++){
                a[i][h]=scan.nextInt();
            }
        }
        scan.close();
     //checking rows and coloumns are equal or not   
    if(rows!=colum){
        System.out.println("it's not possible to show triabgular matrix because no of rowe and coloumns are not equal");
    }

    else{
     for(int i=0; i<a.length; i++){
            for(int h=0; h<a.length; h++){
                if(i<h)//if row index greater than coloumn,print '0'at that position
                 System.out.print("0"+" ");
                 else{//if not print value at that position
                     System.out.print(a[i][h]+" ");
                 }
             }
            System.out.println();
        }
     }
    }

    
}
