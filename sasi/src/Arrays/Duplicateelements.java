package Arrays;

import java.util.Scanner;

public class Duplicateelements 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in); //input user
        int n=sc.nextInt(); //read an element
        int arr[]=new int[n]; //array declare
       for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt(); //read an elemts of array
        }
        for(int i=0;i<arr.length;i++)  //loop for certain length
        {
            for(int j=i+1;j<arr.length;j++) //search for dupliacte array
            {
               if(arr[i]==arr[j]) 
               {
                System.out.println(arr[j]);
               }
            }
            sc.close();
        
        }
    }
}
