package Arrays;
//program to find average of an array
import java.util.Scanner;

public class ArrayExcersice38 {
    public static void main(String[] u){
         Scanner sc=new Scanner(System.in);
         System.out.println("enter no of rows");
             int row=sc.nextInt();
             System.out.println("enter no of colams");
             int col=sc.nextInt();
             int sum=0;
             int average=0;

             System.out.println("enter array elements");
        //declaring and initializing an array
        int[][] mat=new int[row][col];
        for(int i=0;i<row;i++) { 
         for(int j=0;j<col;j++) { 
             mat[i][j]=sc.nextInt();
            }
        }
    sc.close();
        //traversing the array to calculate sum of elements
        for(int i=0;i<row;i++){ 
         for(int j=0;j<col;j++){ 
          sum = sum + mat[i][j];
         }
        }
     //calculating average of array
     average =sum/(row*col);
     System.out.printf("AVERAGE of the elements "+average) ;
 } 
}


    
    

