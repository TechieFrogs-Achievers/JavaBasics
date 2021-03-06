package PracticeExcercises;

import java.util.Scanner;

public class PerfectCube 
{
    public static void main(String[] args) 
    {
        int sum=0,k,nextCube;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of items");
        int n=sc.nextInt();
        System.out.println("enter the items prices");
        int item[]=new int[n];//number of inputs stored in an array
        while(!sc.hasNextInt())//checking for giving input is int or not

        {
            System.out.println("this is not an integer ,pleasen enter positive integer values" );
             sc.next();//moves to the next token 
        }
        for(int i=0;i<n;i++)
        {
            item[i]=sc.nextInt();
            sum+=item[i];//calculating the sum of all the inputs
        }
        nextCube=(int)Math.floor(Math.cbrt(sum))+1;//checking the next perfect cube for sum value
        k=nextCube*nextCube*nextCube;//calculating the next perfect cube value
        //System.out.println(k);//printing the next perfect cube value
        if(sum==k)//checking the total sum is perfect number or not
        {
            System.out.println("YES");
        }
        else 
        {
           System.out.println(k-sum);//printig the required sum to be added to the sum to make perfect cube
        }
    
        sc.close();

        
    }
    
}
