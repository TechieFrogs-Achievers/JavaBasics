package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Array23Sort 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);//input user
        int n=sc.nextInt();//read an elem
        int arr[]=new int[n];//store an elemt
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt(); //read the elem
        }
        Arrays.sort(arr); //sort function 
        for(int i=0;i<arr.length;i++) // read the elem
        {
        System.out.println(arr[i]);
        }
        sc.close();
    }
}
