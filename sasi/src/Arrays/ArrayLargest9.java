package Arrays;

import java.util.Scanner;

public class ArrayLargest9
 {
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in); //input user
        int n=sc.nextInt(); // read an elemts
        int arr[]=new int[n];
       // int min=arr[0];
        int max=arr[0]; //min arr
        for(int i=0;i<arr.length;i++) //len of arr 
        {
            arr[i]=sc.nextInt(); // read an arr
        }
       /* for (int i=0;i<arr.length;i++)
        {
            if(min>arr[i])
            {
                min=arr[i];
            }
        }
                System.out.println("minimum array:"+min);*/
            for (int i=0;i<arr.length;i++)
        {
            if(max<arr[i]) //chck max value
            {
                max=arr[i];//assigning max value to arr
            }
            
        }
                System.out.println("maximum array:"+max);
                sc.close();
        }
    }

