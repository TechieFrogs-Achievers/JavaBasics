package Arrays;
import java.util.*;
public class ArrayExample3 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);//scanner class
        System.out.println("Enter size of array : ");
        int size = sc.nextInt();
        int []arr1 = new int[size];
        System.out.println("Enter the elements:");    
        for (int i = 0; i < size; i++)//print values
         {  
            arr1[i] = sc.nextInt();             
         } 
        System.out.println("original array:");   
        for(int i=0;i<arr1.length;i++)//print original values
        {
            System.out.print(arr1[i]+" ");
        }
        System.out.println("\n"+"rotate the given array by given times towards left:");
            int n = sc.nextInt();
            for(int i=0;i<n;i++)//rotate towords left 
            {
               int j,first;
               first=arr1[0];
               for(j=0;j<arr1.length-1;j++)//stores the first elements of an array
               {
                   arr1[j]=arr1[j+1];
               }
               //first element of an array will be added to the end
             arr1[i]=first;
            }
         System.out.print("");
         //display result
         System.out.print(" Array after left rotation:");
         for(int i=0;i< arr1.length;i++)
         {
             System.out.print(arr1[i]+" ");
         }
    }
}
