import java.util.Scanner;

public class ArrayExample26
 {
    public static void main(String[] args)
     {
        //initializing two dimensional arrays 
        int matrix1[][] = new int[3][3];
        int matrix2[][] = new int[3][3];
        int sub[][] = new int[3][3];

        Scanner sc = new Scanner(System.in);
         System.out.println("enter elements of first matrix : ");
         for(int i = 0; i <3 ; i++)
         {
             for(int j = 0; j<3 ; j++)
             {
                 matrix1[i][j] =sc.nextInt();//input from keyboard
             }
         }

         System.out.println("enter elements of second matrix : ");
         for(int i = 0; i <3 ; i++)
         {
             for(int j = 0; j<3 ; j++)
             {
                 matrix2[i][j] =sc.nextInt();//taking matrix two input from keyboard
             }
         }

         System.out.println("first matrix : ");

         //printing first matrix

         for(int i = 0; i <3 ; i++)
         {
             for(int j = 0; j<3 ; j++)
             {
               System.out.print( matrix1[i][j] +" ");
             }
             System.out.println();
         }

         System.out.println("second matrix : " );

         //printing second matrix

         for(int i = 0; i <3 ; i++)
         {
             for(int j = 0; j<3 ; j++)
             {
                 System.out.print( matrix2[i][j] +" ");
             }
             System.out.println();
         }  
         //subtracting matrix one from second matrix

         for(int i = 0; i <3; i++)
         {
             for(int j =0; j < 3 ;j++)
             {
                 sub[i][j] = matrix1[i][j] -matrix2[i][j];
             }
         }
         System.out.println("subtracted matrix : ");
         for(int i = 0; i <3 ; i++)
         {
             for(int j = 0; j<3 ; j++)
             {
               System.out.print(  sub[i][j] + " ");//final matrix printing
             }
             System.out.println();
          }
          sc.close();
    }
}
