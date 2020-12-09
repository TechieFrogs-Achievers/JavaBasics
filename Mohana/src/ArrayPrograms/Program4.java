package ArrayPrograms;

import java.util.Scanner;

public class Program4 
{
    public static void main(String[] args)
    { 
        System.out.println("enter the length of the array");
        Scanner sc = new Scanner(System.in);
      
       int l = sc.nextInt();
       int a1[] = new int[l];
       for(int i =0;i<l;i++)
       {
              a1[i]= sc.nextInt();
       } 
       
       System.out.println("array elements are : ");
      
       for(int i : a1)
       {
           System.out.print(i + " ");
       } 
       System.out.println();

       System.out.println("duplicate values in an array : ");
       
       for(int i = 0; i < a1.length; i++)
       {
           for(int j = i+1 ; j< a1.length;j++)
           {
               if(a1[i] == a1[j])
               {
                System.out.print(a1[j]+ " ");
               }
           }
       }  
         
      sc.close(); 
    }
    
}
