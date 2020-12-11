package Arrays;
import java.util.*;

class Multiply{

    void multiply(int[][] a, int[][] b){
        //declaring another matrix to store resultant values
        int[][] product=new int[3][3];

     //product of two matrices 
     System.out.println("product of two matrices");
     for(int i =0 ; i <3; i++){
      for(int j =0; j<3 ;j++){ 
          product[i][j]=0;
          for(int k =0;k <3 ; k++) {
             product[i][j] = a[i][k] * b[k][j];
          } 

          System.out.print(product[i][j] + " ");
      }
      System.out.println();
  }
 
    }
}
         
    //Driver class
    public class ArrayExcersice43 {

    public static void main(String[] args){
        //instantiation of a class
        Multiply mobj=new Multiply();
        //declaration of arrays
        int arr1[][] = new int[3][3];
        int arr2[][] = new int[3][3];
        
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
         sc.close();

         mobj.multiply(arr1,arr2);
    
}
}