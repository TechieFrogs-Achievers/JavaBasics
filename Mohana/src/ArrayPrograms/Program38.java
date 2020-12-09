package ArrayPrograms;

import java.util.Scanner;

public class Program38 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);//scanner class obj creation

        int length = sc.nextInt();//taking length
        int sum = 0; //initializing sum value

        int arr[] = new int[length];//creating an array 
        for(int i = 0; i < length ;i++)
        {
            arr[i] =sc.nextInt();//taking input 
            sum += arr[i];//summing of elements
        }  
        System.out.println("sum of array elements : " +sum);

        int avg = sum/length;//avg formula

        System.out.println("avg of elements are : " +avg);
       
        sc.close();
    }
    
}
