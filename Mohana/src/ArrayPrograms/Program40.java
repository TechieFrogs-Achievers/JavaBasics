package ArrayPrograms;

import java.util.Scanner;

public class Program40 
{
    public static void main(String[] args) 
    {
        double sum = 0, mean;
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter the length  of an array");
        int  l = sc.nextInt();
        System.out.println("enter array elements");
        double arr[] = new double[l];//array declaration with size n
        for(int i=0; i<arr.length; i++)
        {
            arr[i] = sc.nextInt();//taking array elements from keyboard
            sum = sum+arr[i];//adding each of array elements
        }
        mean = sum/l;//calculating mean value
        System.out.println("the mean values ="+mean);
        for(int i=0;i<l;i++) 
        {
            sum+=Math.pow((arr[i]-mean),2);//calculating sum with mean difference for each input
        
        }
        mean=sum/(l-1);
        double Varience = Math.sqrt(mean);//thea varience value from mean
        System.out.println(" the varience values is ="+Varience);
        sc.close();
        
    }
    
}
