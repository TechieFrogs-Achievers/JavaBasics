package Arrays;

import java.util.Scanner;

public class Averageofanarray
 {
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);//input user
        int n=sc.nextInt();//read an elem
        int arr[]=new int[n];// stores in arr
        for(int i=0;i<arr.length;i++) //arr len loop
        {
            arr[i]=sc.nextInt();//read the inputs 
        }
        int sum=0; //initilazed sum var
        for(int i=0;i<arr.length;i++) // loop for sum 
        {
            sum=sum+arr[i]; // addition 
        }
        float avg=sum/arr.length; 

        System.out.println("average of an array:"+avg);
        sc.close();
    }
}
