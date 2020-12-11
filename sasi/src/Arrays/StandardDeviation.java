package Arrays;

import java.util.Scanner;

public class StandardDeviation 
{
    public static void main(String[] args)
     {
        Scanner sc=new Scanner(System.in); //input user 
        int n=sc.nextInt();//read elm
        int arr[]=new int[n];//stores in arr
        for(int i=0;i<arr.length;i++) //loop for len ofelem
        {
            arr[i]=sc.nextInt();//read the elem 
        }
        int sum=0; // varibale
        double sd=0.0;
        for(int i=0;i<arr.length;i++)// loop for sum
        {
            sum=sum+arr[i];
        }  
        float mean=sum/arr.length;
        System.out.println("average of an array:"+mean);
        for(int i=0;i<arr.length;i++) //loop for avg
        {
            sd=sd+Math.pow(arr[i]-mean,2);
        }
        System.out.println(Math.sqrt(sd/arr.length-1));
        sc.close();
    }
}
