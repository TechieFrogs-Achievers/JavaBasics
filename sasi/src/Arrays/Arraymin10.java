package Arrays;

import java.util.Scanner;

public class Arraymin10 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in); //input user
        int n=sc.nextInt(); //read an elemt
        int arr[]=new int[n]; //arr len
        int min =arr[0];
        for(int i=0;i<arr.length;i++) //loop for length
        {
            arr[i]=sc.nextInt(); //read an elem
        } 
        for (int i=0;i<arr.length;i++) //loop for read an elem
        {
            if(min>arr[i])//chcks the arr
            {
                min=arr[i];//min value stores in arr
            }
        }
                System.out.println("minimum array:"+min);
    }
}
