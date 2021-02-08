package codingassessment;
import java.util.Scanner;

class Code{
    int[] []product;
    int[] []add;
      
//method to find product of two numbers
public int[][] producttt(int[][] arr1, int[][] arr2) {

       //logic inside method
        for(int i =0 ; i <3; i++){
             for(int j =0; j<3 ;j++){ 
                 product[i][j]=0;
                 for(int k =0;k <3 ; k++) {
                    product[i][j] = arr1[i][k] * arr2[k][j];
                 } 
             }
             System.out.println();
         }
        return product;
    }
//method to find addition of two matrices
public int[][] add(int[][] arr1, int[][] arr2) {
    //logic inside method
    for(int i =0 ; i <3; i++){
        for(int j =0; j<3 ;j++){ 
           
               add[i][j] = arr1[i][j] + arr2[i][j];
            } 
            System.out.println();
    }
        return add;
    }

}

public class Two {
    public static void main(String[] args){
        //declaration of arrays
        int arr1[][] = new int[3][3];
        int arr2[][] = new int[3][3];
       // int product[][] = new int[3][3];
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
         for(int i = 0; i <3 ; i++){
             for(int j = 0; j<3 ; j++) {
                 arr2[i][j] =sc.nextInt();
             }
         }
        sc.close();

         //instantiation of class code
         Code c=new Code();
        int[][] a= c.producttt(arr1,arr2);
        int[][] b= c.add(arr1,arr2);

        //printing substraction of two arrays
         System.out.println("product of two matrices");
        for(int i = 0; i <3 ; i++) {
            for(int j = 0; j<3 ; j++){
                  System.out.print( a[i][j] +" ");
              }
              System.out.println();
          }  
          //printing addition of two arrays
         System.out.println("addition of two matrices");
          for(int i = 0; i <3 ; i++) {
            for(int j = 0; j<3 ; j++){
                  System.out.print( b[i][j] +" ");
              }
              System.out.println();
          }  
        if(a==b){
            System.out.println("product and addition of two arrays are equal");
        }
        else{
            System.out.println("product and addition of two arrays are not equal");
        
        }
        
        }
    
}
