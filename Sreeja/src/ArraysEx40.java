import java.util.*;
public class ArraysEx40
 {
    public static void main(String[] args) 
    {
        double sum = 0, mean;
        
        Scanner sc = new Scanner(System.in);            //create scanner class object
        
        System.out.println(" enter the size  of an array");
        
        int  size = sc.nextInt();               //read size from user
        
        System.out.println("enter array elements");
        
        int arr[] = new int[size];              //create array to store
        
        //loop to get the values from user
        
        for(int i=0; i<size; i++)
        {
            arr[i] = sc.nextInt();
            sum = sum+arr[i];        //adding each of array elements
        }
        
        mean = sum/size;        //calculating mean value
        
        System.out.println("the mean value ="+mean);
        
        //loop to add the elements  mean difference of each input
        
        for(int i=0;i<size;i++) 
        {
            sum+=Math.pow((arr[i]-mean),2);
        
        }
        
        mean=sum/(size-1);
        
        double Varience = Math.sqrt(mean);        //formula for variance
        
        System.out.println(" the varience values is ="+Varience);
        sc.close();
    }
}
