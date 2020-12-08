package Arrays;

import java.util.Scanner;

public class Array1copy
 {
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner (System.in);  // input user
         int n=sc.nextInt(); 
         int arr[]=new int[n]; //initilize an element
         int arr1[]=new int[n];
         for(int i=0;i<arr.length;i++)  //iterate until len is there
         {
             arr[i]=sc.nextInt(); //array reading elemts
         }
        // arr1=arr //copy one array to another
         arr1=arr.clone(); //coping arr to another array by using clone
         for(int i=0;i<arr1.length;i++) //printing the elemts 
         {
            System.out.println(arr1[i]+" ");
         }
           sc.close(); 
        }

    }
