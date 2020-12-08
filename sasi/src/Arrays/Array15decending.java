package Arrays;

import java.util.Scanner;

public class Array15decending
 {
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in); //input user
        int n=sc.nextInt(); // read the elemts 
        int arr[]=new int[n]; //arry len
        int temp;
        for(int i=0;i<arr.length;i++) //loop for len
        {
            arr[i]=sc.nextInt(); // read the elements 
        }
       // for(int i=0;i<arr.length;i++) // read the elemts
       // {
            for (int i = 0; i < arr.length; i++)//read elemfor 1stelem
            {
                for (int j = i+1; j < arr.length; j++)  //read for remaning elem
                {
                    if(arr[i] < arr[j]) //comparing of elem
                    {
                        temp = arr[i]; //swapping the elements 
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }  
                }  
            System.out.print(arr[i]+" ");
            sc.close();
                }
        }
    }

