import java.util.Scanner;

public class ArrayExample33 
{
    public static void main(String[] args)
    {
        int a[][] = new int[3][3];
        int b[][] = new int[3][3];
        int product[][] = new int[3][3];
        Scanner sc = new Scanner(System.in);

        System.out.println("first array elements : ");

        for(int i =0; i <3 ; i++)
        {
            for(int j=0;j<3;j++)
            {
                a[i][j] = sc.nextInt();//first array elements 
            }
        }
        System.out.println("enter elements of second array : ");
         for(int i = 0; i <3 ; i++)
         {
             for(int j = 0; j<3 ; j++)
             {
                 b[i][j] =sc.nextInt();//taking second array from keyboard
             }
         }

         System.out.println("first array : ");

         //printing first matrix2
         

         for(int i = 0; i <3 ; i++)
         {
             for(int j = 0; j<3 ; j++)
             {
               System.out.print( a[i][j] +" ");
             }
             System.out.println();
         }

         System.out.println("second array : " );

         //printing second matrix

         for(int i = 0; i <3 ; i++)
         {
             for(int j = 0; j<3 ; j++)
             {
                 System.out.print( b[i][j] +" ");
             }
             System.out.println();
         }   

         System.out.println("product of two matrices");
         
         for(int i =0 ; i <3; i++)
         {
             for(int j =0; j<3 ;j++)
             { 
                 product[i][j]=0;
                 for(int k =0;k <3 ; k++)
                 {
                    product[i][j] = a[i][k] * b[k][j];//matrix multiplication
                 } 

                 System.out.print(product[i][j] + " ");
             }
             System.out.println();
         }
        sc.close();
    }
}
