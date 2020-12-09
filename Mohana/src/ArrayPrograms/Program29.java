package ArrayPrograms;

import java.util.Scanner;

public class Program29 
{
    public static void main(String[] args) 
    {  
        boolean  value = true;
        int arr1[][] = new int[3][3];
        int arr2[][] = new int[3][3];
        Scanner sc = new Scanner(System.in);

        System.out.println("first array elements : ");

        for(int i =0; i <3 ; i++)
        {
            for(int j=0;j<3;j++)
            {
                arr1[i][j] = sc.nextInt();//first array elements 
            }
        }
        System.out.println("enter elements of second array : ");
         for(int i = 0; i <3 ; i++)
         {
             for(int j = 0; j<3 ; j++)
             {
                 arr2[i][j] =sc.nextInt();//taking second array from keyboard
             }
         }

         System.out.println("first array : ");

         //printing first matrix

         for(int i = 0; i <3 ; i++)
         {
             for(int j = 0; j<3 ; j++)
             {
               System.out.print( arr1[i][j] +" ");
             }
             System.out.println();
         }

         System.out.println("second array : " );

         //printing second matrix

         for(int i = 0; i <3 ; i++)
         {
             for(int j = 0; j<3 ; j++)
             {
                 System.out.print( arr2[i][j] +" ");
             }
             System.out.println();
         }  
         for(int i = 0; i <3; i++)
         {
             for(int j =0 ; j <3;j++)
             {
                 if(arr1[i][j] != arr2[i][j])//condition two check both are equal are not
                 {
                     value = false;
                 } 

             }
         } 
         if(value)
         {
             System.out.println("Both matrices are  equal");
         }  
         else{
             System.out.println(" both matrices are not equal");
         }
        
       sc.close();
    }
    
}
